/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Eddie Pincay
 * Example with QueueCollection
 */
public class QueueCollections {
    /**
     * @param args the command line arguments
     */
    
    static Queue<String> family = new LinkedList<>();
    Iterator<String> iterator = family.iterator();
        
    public QueueCollections() {
        family.add("Eddie");
        family.add("Silvia");
        family.add("Daniela");
        family.add("Amelia");
        family.add("Julian");
        System.out.println("The Queue has been created!");
    }
    
    //this method show the firts lien in the queue
    public static void firstQueues() {
        System.out.println("The first person in the Queue is "+family.peek()+".");
    }
    
    //this method show queue
    public static void showQueues() {
        for(Object object : family) {
            String element = (String) object;
            System.out.println(element);
        }
        System.out.println();
    }
    
    //this method search into queue
    public static void searchQueues(String person) {
        System.out.println("Searching for "+person+" in the Queue.");
        if(family.contains(person)) {
            System.out.println("Found "+person+" in the Queue.");
        } else {
            System.out.println("Could not find "+person+" in the Queue.");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new QueueCollections();
        
        System.out.println("There is my family group..");
        showQueues();
        
        System.out.println("We will find for my little daughter...");
        searchQueues("Amelia");
        
        System.out.println("We will find for my brother Julio...");
        searchQueues("Julio");
        
        System.out.println("We will find the first person in the queue...");
        firstQueues();
    }
}
