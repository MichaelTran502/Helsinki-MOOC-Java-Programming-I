
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == 0) {
                break;
            }
            
            if (value > 0) {
                count++;
                sum += value;
            }
        }
        
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0*sum/count;
            System.out.println("Average of the numbers: " + average);
        }
    }
}
