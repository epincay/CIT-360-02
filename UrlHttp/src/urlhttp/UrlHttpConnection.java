/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlhttp;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Eddie Pincay
 */
public class UrlHttpConnection {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
            
            // Connect Website
            URL myUrl = new URL("http://edsipro.com");
            HttpURLConnection connectUrl = (HttpURLConnection) 

            
            myUrl.openConnection();
            
            // Print connection message
            System.out.println("Response: " +
                                        connectUrl.getContentType());

            if(connectUrl.getContentType() != null){
                        System.out.println("Yeah you connected!");

            }
            else{
                System.out.println("Connection failed, sorry");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
