/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Eddie Pincay
 * Example with MapCollection
 */
class PokeLocated{
    private int ivr;
    private String name;
    private String place;
    
    public PokeLocated(int ivr, String name, String place){
        this.ivr = ivr;
        this.name = name;
        this.place = place;
    }
    public String toString() {
        return "(Pokemon: " + name + " ivr(level) is: " + ivr + "% - Located in " + place + ")";
    }
// Add hashCode and equals as Comparators if you think there are duplicates
    @Override
    public int hashCode() {
        int hash = 9;
        hash = 97 * hash + this.ivr;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.place);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PokeLocated other = (PokeLocated) obj;
        if (this.ivr != other.ivr) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.place, other.place)) {
            return false;
        }
        return true;
    }
    
}


public class MapCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PokeLocated poke1 = new PokeLocated(80, "Charizard", "London");
        PokeLocated poke2 = new PokeLocated(60, "Vulpix", "Guayaquil");
        PokeLocated poke3 = new PokeLocated(70, "Alakazam", "Quito");
        PokeLocated poke4 = new PokeLocated(30, "Porygon", "Rexburg");
        PokeLocated poke5 = new PokeLocated(98, "Dragonite", "Duran");
        PokeLocated poke6 = new PokeLocated(100, "Mewtwo", "Guayaquil");
        
        Map<PokeLocated, Integer> map = new LinkedHashMap<>();
        // Use put to add to the map
        map.put(poke1, 1);
        map.put(poke2, 2);
        map.put(poke3, 3);
        map.put(poke4, 4);
        map.put(poke5, 5);
        map.put(poke6 ,6);
        
        // Shows that map keys are not unique and  will not include a duplicate item
        
        // Iterate through the map
        for(PokeLocated key: map.keySet()) { 
            System.out.println(key + ": " + map.get(key));
        }
        Set<PokeLocated> set = new LinkedHashSet<>();
        // Add items to the set
        set.add(poke1);
        set.add(poke2);
        set.add(poke3);
        set.add(poke4);
        set.add(poke5);
        set.add(poke6);
        System.out.println(set);
    }
    
}
