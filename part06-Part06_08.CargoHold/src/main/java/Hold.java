
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        String output = "";
        if (suitcases.size() == 1) {
            output = suitcases.size() + " suitcase(" + this.totalWeight() + " kg)";
        } else {
            output = suitcases.size() + " suitcases(" + this.totalWeight() + " kg)";
        }
        
        return output;
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }
        
        return weight;
    }
    
    public void printItems() {
       for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
}
