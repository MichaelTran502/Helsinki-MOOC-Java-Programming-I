
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNextLine()) {
                String value = scan.nextLine();
                String[] splitValue = value.split(",");
                String name = splitValue[0];
                int age = Integer.valueOf(splitValue[1]);
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
