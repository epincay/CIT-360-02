/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlhttp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Eddie Pincay
 */
public class UrlHttpRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        try{
            // Conection
            URL myUrl = new URL("http://edsipro.com");
            URLConnection connectUrl = myUrl.openConnection();
            
            // Read website 
            BufferedReader inUrl = new BufferedReader(new InputStreamReader(
                                        connectUrl.getInputStream()));
            
            // Displaying output as a string (HTML CODE)
            String inputLine;
            
            while ((inputLine = inUrl.readLine()) != null) 
                System.out.println(inputLine);
            
            inUrl.close(); // Close the stream
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
