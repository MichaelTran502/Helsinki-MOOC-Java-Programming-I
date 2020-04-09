
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longestName = "";
        int length = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] splitInput = input.split(",");
            sum += Integer.valueOf(splitInput[1]);
            count++;
            if (splitInput[0].length() > length) {
                length = splitInput[0].length();
                longestName = splitInput[0];
            }
            
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0*sum/count);


    }
}
