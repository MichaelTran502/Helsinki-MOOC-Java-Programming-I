
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String value = scanner.nextLine();
            
            if (value.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (value.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
            } else if (value.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                String translated = this.dict.translate(toTranslate);
                if (translated == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                
                    System.out.println("Translation: " + translated);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    
    
}
