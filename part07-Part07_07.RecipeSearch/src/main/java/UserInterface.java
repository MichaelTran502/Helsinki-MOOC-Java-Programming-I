
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class UserInterface {
    
    private ArrayList<Recipe> recipes;
    private Scanner scanner;
    private String filename;
    
    public UserInterface(String filename, Scanner scanner) {
        this.recipes = new ArrayList<>();
        this.scanner = scanner;
        this.filename = filename;

    }
    
    public void start() {
        printCommands();
        getRecipes();
        processCommands();

    }
    
    public void getRecipes() {
        
        try(Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                Recipe recipe = new Recipe(name, time);
                while (scan.hasNextLine()) {
                    String ingred = scan.nextLine();
                    if (ingred.length() == 0) {
                        break;
                    }
                    recipe.add(ingred);
                }
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }

    public void printCommands() {
        
        System.out.println("\nCommands");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program\n");
        
    }
    
    public void processCommands() {
        System.out.print("Enter command: ");
        
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    System.out.println(recipe);
                }
                
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int number = Integer.valueOf(scanner.nextLine());
                
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.getCookingTime() <= number) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String word = scanner.nextLine();
                
                System.out.println("\nRecipes:");
                for (Recipe recipe: recipes) {
                    if (recipe.hasIngredient(word)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
}
