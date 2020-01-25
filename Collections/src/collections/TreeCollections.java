/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Eddie Pincay
 * Example with TreeCollection
 */

public class TreeCollections {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<String> mammals = new TreeSet<>();
        
        //adding treeSet Endangered animals
        mammals.add("Spider monkeys");
        mammals.add("Night monkeys");
        mammals.add("Marmosets");
        mammals.add("Tamarins");
        mammals.add("Woolly monkeys");
        mammals.add("Capuchins");
 
        System.out.println("Endangered animals in Ecuador");
        
        // Iterate through TreeSet
        Iterator<String> itr = mammals.iterator();
        while(itr.hasNext()) {
        System.out.println("TreeSet list: " + itr.next());
        }
        
        //Show the first element
        String first = mammals.first();
        System.out.println("First element in TreeSet is: "+first);
        
        //Show the Last element
        String last = mammals.last();
        System.out.println("Last element in TreeSet is: "+last);
        
    }
}
