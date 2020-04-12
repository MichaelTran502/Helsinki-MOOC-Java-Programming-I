/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Bird implements Comparable<Bird>{
    
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public int getObservations() {
        return observations;
    }

    public String getLatinName() {
        return latinName;
    }
    
    public void addObservation() {
        observations++;
    }
    
    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observations + " observations";
    }
    
    @Override
    public int compareTo(Bird bird) {
        int compareObs = bird.getObservations();
        
        // descending
        return compareObs-this.getObservations();
        
        // ascending
        // this.getObservations()-compareObs;
    }
    
} 
