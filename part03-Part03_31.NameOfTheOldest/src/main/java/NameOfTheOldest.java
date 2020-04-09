import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput =  input.split(",");
            names.add(splitInput[0]);
            int age = Integer.valueOf(splitInput[1]);
            ages.add(age);
   
        }
        
        int index = 0;
        int max = 0;
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) > max) {
                max = ages.get(i);
                index = i;
            }
        }
        System.out.println("Name of the oldest: " + names.get(index));

    }
}
