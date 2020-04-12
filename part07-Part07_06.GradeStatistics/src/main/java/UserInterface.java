
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
    private Point point;
    private Scanner scanner;

    public UserInterface(Point point, Scanner scanner) {
        this.point = point;
        this.scanner = scanner;
    }
    
    
    
    public void start() {
        processPoints();
        printAverages();
        printPassing();
        printPassPercentage();
        printGradeDistribution();
    }
    
    public void processPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            String value = scanner.nextLine();
            if (value.equals("-1")) {
                break;
            }
            
            int number = Integer.valueOf(value);
            
            if (number >= 0 && number <= 100) {
                this.point.addPoint(number);
            }
        }
    }
    
    public void printAverages() {
        System.out.println("Point average (all): " + this.point.average());
    }
    
    public void printPassing() {
        int pass = point.passing();
        
        if (pass == 0) {
            System.out.println("Point average (passing):-");
        } else {
            System.out.println("Point average (passing): " + point.numPassing());
        }
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + point.passPercentage());
    }
    
    public void printGradeDistribution() {
        
        int[] grades = point.gradeDistribution();
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
