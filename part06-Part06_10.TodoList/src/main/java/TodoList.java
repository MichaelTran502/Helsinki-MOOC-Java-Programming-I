
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
public class TodoList {
        private ArrayList<String> lists;

    public TodoList() {
        this.lists = new ArrayList<>();
    }
    
    public void add(String task) {
        lists.add(task);
    }
    
    public void print() {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(i+1 + ": " + lists.get(i));
        }
    }
    
    public void remove(int number) {
        lists.remove(number -1);
    }
}

