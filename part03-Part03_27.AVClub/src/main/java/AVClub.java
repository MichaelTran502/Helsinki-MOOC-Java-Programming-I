
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(" ");
            for (String substring: splitInput) {
                if (substring.contains("av")) {
                    System.out.println(substring);
                }
            }
        }

    }
}
