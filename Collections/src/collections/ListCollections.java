/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Eddie Pincay
 * Example with ListCollection
 */
public class ListCollections {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // We create a new List.
        ArrayList listStrings = new ArrayList<String>();
		 
        // We add to the list. 
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Hello");
		 
        System.out.println("Print all List..");
        System.out.println("listStrings: " + listStrings);
	
        //Adding a new element into the list
        listStrings.add(1, "Four");
	     
        //Print the elements of list
        System.out.println("listStrings: " + listStrings);
	     
        //Modify the string using set method. This will replace what is already in the index.
        listStrings.set(2, "Hi everybody");
	     
        // Print the elements of list
        System.out.println("listStrings: " + listStrings);

        // Remove an element in the list. 
        listStrings.remove(5);  // the index.
        listStrings.remove("Two"); // the actual element.

        // Print the elements of the List
        System.out.println("listStrings: " + listStrings);

        // Search the list.
        if (listStrings.contains("Hello")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element isn't found");
        } 
    }
}
