
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
public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        String output = "";
        if (items.size() == 1) {
            output = items.size() + " item(" + this.totalWeight() + " kg)";
        } else {
            output = items.size() + " items(" + this.totalWeight() + " kg)";
        }
        
        return output;
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item returnObject = items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > returnObject.getWeight()) {
                returnObject = item;
            }
        }
        
        return returnObject;
    }
    
    
}
