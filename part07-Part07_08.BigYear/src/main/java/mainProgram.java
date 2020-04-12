
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        while (true) {
            System.out.print("?");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.add(new Bird(name, latinName));
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String obser = scan.nextLine();
                boolean found = false;
                for (Bird bird : birds) {
                    if (bird.getName().equals(obser)) {
                        found = true;
                        bird.addObservation();
                    }
                }
                
                if (!found) {
                    System.out.println("Not a bird!");
                }
                
                
            } else if (command.equals("All")) {
                Collections.sort(birds);
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
                
            } else if (command.equals("One")) {
                System.out.print("Bird?");
                String obser = scan.nextLine();
                for (Bird bird : birds) {
                    if (bird.getName().equals(obser)) {
                        
                        System.out.println(bird);
                        break;
                    }
                }
            } else {
                System.out.println("Invalid command");
            }
        }

    }

}
