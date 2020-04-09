
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
public class Room {
    
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < returnObject.getHeight()) {
                returnObject = person;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person removed = this.shortest();
        
        int j = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i) == removed) {
                j = i;
                break;
            }
        }
        
        return persons.remove(j);
    }
}
