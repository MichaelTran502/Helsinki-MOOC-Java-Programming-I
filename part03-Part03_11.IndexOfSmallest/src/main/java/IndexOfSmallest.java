
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> integers = new ArrayList<>();
        while(true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 9999) {
                break;
            }
            integers.add(value);
        }

        
        
        int smallest = integers.get(0);
        
        for(int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < smallest) {
                smallest = integers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for(int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
