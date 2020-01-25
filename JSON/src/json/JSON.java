/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//JSON libraries
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Eddie Pincay
 */
public class JSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
        // TODO code application logic here
        
        System.out.println("..Create a Training Card(JSON)..");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of training: ");
        String training = input.nextLine();

        // Create new JSON object for training
        JSONObject trainingObject = new JSONObject();

        // Add the Training
        trainingObject.put("Training Name", training);

        // Create JSON array to Pokemon
        JSONArray pokeInfo = new JSONArray();

        while (true) {

            // Get the pokemon name
            System.out.println("Enter pokemon name (enter q and press ENTER to quit): ");
            String pokeName = input.nextLine();

            // Validate when the user press q quit
            char c = pokeName.charAt(0);
            
            if (c == 'q') {
                break;
            }

            //  Get the ivr (level)
            System.out.println("Enter ivr pokemon: ");
            String pokeIvr = input.nextLine();

            // Get the location cacth
            System.out.println("Enter location cacth: ");
            String pokeCatch = input.nextLine();

            // Create JSON object and array
            JSONObject pokeObject = new JSONObject();
            pokeObject.put("name", pokeName);
            pokeObject.put("ivr", pokeIvr);
            pokeObject.put("catch", pokeCatch);

            // Add the song information to the array of songs
            pokeInfo.add(pokeObject);
        }

        // Add the array of pokemon to the training object
        trainingObject.put("Pokemon Information", pokeInfo);
        
        // Display the information that will be written to the JSON file
        System.out.println("Here is the information that will be written to the JSON file:\n\t" + trainingObject.toJSONString() + "\n");

        // Create and write to JSON file
        File file = new File("C:\\Users\\Eddie Pincay\\Documents\\NetBeansProjects\\CIT-360-03\\JSON\\trainingCard.json");

        try (PrintWriter writeFile = new PrintWriter(file)) {
            writeFile.print(trainingObject.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        // Read the file
        System.out.println("JSON file has create.\n\n "
                + "** Press any to display the file **");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()){
                jsonIn.append(input.nextLine());
            }
                System.out.println(jsonIn.toString());
                
                JSONParser parser = new JSONParser(); // Parse objects
                
                JSONObject objAname = (JSONObject) parser.parse(jsonIn.toString()); // Cast object
                
                System.out.println("Training Name: " + objAname.get("Training Name").toString() + "\n");
                
                JSONArray pokeIn = (JSONArray) objAname.get("Pokemon Information");
                
                for(int i = 0; i < pokeIn.size(); i++) {
                    JSONObject pokemonIn = (JSONObject) pokeIn.get(i);
                    String pokeNameIn = (String) pokemonIn.get("name");
                    String pokeIvrIn = (String) pokemonIn.get("ivr");
                    String pokeCatchIn = (String) pokemonIn.get("catch");
                    
                    System.out.println("Pokemon Information:" + "\n\t" + pokeNameIn + "\n\t" + pokeIvrIn + "\n\t" + pokeCatchIn);
                }
                
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());  
        }
    }
    
}
