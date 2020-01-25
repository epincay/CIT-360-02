/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Eddie Pincay
 */
public class ParseJSONFile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        // parsing file "composer.json"
         Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Eddie Pincay\\Documents\\NetBeansProjects\\CIT-360-03\\JSON\\composer.json"));

        // typecasting obj to JSONObject
        JSONObject jObject = (JSONObject) obj;

        String name = (String) jObject.get("name");
        String license = (String) jObject.get("license");
        
        //Obtain fields into JSON
        System.out.println("Name JSON: " + name);
        System.out.println("License: " + license);

        long version = (long) jObject.get("version");
        System.out.println("Version: " + version);
        
        String description = (String) jObject.get("description");
        System.out.println("Description: " + description);
        
        String homepage = (String) jObject.get("homepage");
        System.out.println("Homepage: " + homepage);
               
        // catch require field
        Map require = ((Map) jObject.get("require"));
        System.out.println("Require: ");
        
        // iterating require
        Iterator<Map.Entry> itr = require.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry pair = itr.next();
            System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
        }

        // catch authors
        JSONArray authorsArray = (JSONArray) jObject.get("authors");
        System.out.println("Authors: ");

        // iterating authors
        Iterator itrAuthors = authorsArray.iterator();

        while (itrAuthors.hasNext()) {
            itr = ((Map) itrAuthors.next()).entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry pair = itr.next();
                System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
            }
        }
        
        // catch require field
        Map requireDev = ((Map) jObject.get("require-dev"));
        System.out.println("Require-Dev: ");
        
        // iterating require
        Iterator<Map.Entry> itr1 = requireDev.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println("\t" + pair.getKey() + " : " + pair.getValue());
        }
    }
}
