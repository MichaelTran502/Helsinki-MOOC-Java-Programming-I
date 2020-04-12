
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
public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void add(String ingred) {
        ingredients.add(ingred);
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getName() {
        return name;
    }
    
    public boolean hasIngredient(String ingred) {
        for (String ing : ingredients) { 
            if (ing.equals(ingred))
                return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {

        return name + ", cooking time: " + cookingTime;
    
    }
}
