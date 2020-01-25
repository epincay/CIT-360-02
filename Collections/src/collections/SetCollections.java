/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Eddie Pincay
 * Example with SetCollections
 */
public class SetCollections {
    /**
     * @param args the command line arguments
     */
    
    static Set<String> names = new HashSet<String>();
    static Iterator<String> iterator = names.iterator();
    
    //Create th Set Collection
    public SetCollections(){
        names.add("Charizard");
        names.add("Vulpix");
        names.add("Alakazam");
        names.add("Dragonite"); 
        System.out.println("The pokemons in the set has been initialized..");
    }
    
    // This Method displays the contents of the Set
    public static void showPokemons(Set<String> set) {
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
        System.out.println();
    }
    
    // This Method adds another value into the Set
    private static void addPokemons(String newPokemon) {
	if (!names.add(newPokemon)) {
            System.out.println("Failed! "+newPokemon+" already exists in the Set.");
	} else {
            names.add(newPokemon);
	}
    }
    
    // This Method search value into the Set
    private static void searchPokemons(String newPokemon) {
        if (names.contains(newPokemon)) {
            System.out.println( newPokemon + " is found in the list.");
        } else {
            System.out.println("Failed! " + newPokemon + " isn't exists in the Set.");
	}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Check it's empy
        if(names.isEmpty()) {
            System.out.println("The pokemons set is empty.");
        }
        
        new SetCollections();
        
        System.out.println("Here is the Pokemons in Set.");
        showPokemons(names);       
        
        System.out.println("As you can see, using HashSet does not maintain the"
                + " order of names.");
        System.out.println("If you want to maintain the order in which you've written"
                + " the list, use Set<String> names = new HashLinkedSet<>();");
        System.out.println("If you want to alphabetize your list, use"
                + " Set<String> names = new TreeSet<String>(); because TreeSet "
                + "automatically sorts numerically or alphabetically.");
        
        
        System.out.println("Sets do not accept duplicate items");
        names.add("Dragonite");
        
        System.out.println("Adding new pokemon...");
        addPokemons("Mewtwo");
        
        showPokemons(names);  
        
               
        // You can use set to search for an item
        // You can find an item quicker with Set than with List by using the
        //     contains method
        searchPokemons("Mewtwo");
        
        // Intersection
        Set<String> legendary = new HashSet<>();
        legendary.add("Articuno");
        legendary.add("Zapdos");
        legendary.add("Moltres");
        legendary.add("Mewtwo"); 
        legendary.add("Dragonite");
        
        System.out.println("Create a set of legendary Pokemons...");
        showPokemons(legendary);  
         
        // Create a copy of the original set
        Set<String> intersection = new HashSet<>(names);
            System.out.println(intersection);
        
        // To see what elements intersect between the two sets use the retains method
        intersection.retainAll(legendary);
        System.out.println("The pokemons common to both sets are: " + intersection);
        
        // You can also find the difference between the two by using removeAll()
        Set<String> difference = new HashSet<>(names);
        
        difference.removeAll(legendary);
        System.out.println("This is the difference between the two sets: " + difference);
    }
}
