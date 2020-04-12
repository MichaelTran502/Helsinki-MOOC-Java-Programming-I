
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Point {
    
    private ArrayList<Integer> points;

    public Point() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(Integer value) {
        this.points.add(value);
    }
    
    public double average() {
        
        int sum = 0;
        for (Integer value : points) {
            sum += value;
        }
        
        return 1.0 * sum/points.size();
    }
    
    public int passing() {
        int pass = 0;
        for (Integer value : points) {
            if (value >= 50) {
                pass++;
            }
        }
        return pass;
    }
    
    public double numPassing() {
        int sum = 0;
        for (Integer value : points) {
            if (value >= 50) {
                sum += value;
            }
        }
        
        return 1.0*sum/passing();
    }
    
    public double passPercentage() {
        
        return 100.0*passing()/this.points.size();
        
    }
    
    public int[] gradeDistribution() {
        int[] grades = new int[6];
        
        for (Integer value : points) {
            if (value < 50) {
                grades[0]++;
            } else if (value < 60) {
                grades[1]++;
            } else if (value < 70) {
                grades[2]++;
            } else if (value < 80) {
                grades[3]++;
            } else if (value < 90) {
                grades[4]++;
            } else if (value >= 90) {
                grades[5]++;
            }
        }
        
        return grades;
    }
    
}
