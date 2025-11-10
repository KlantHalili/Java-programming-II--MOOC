/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> axhenda;
    
    public TodoList(){
        this.axhenda = new ArrayList<>();
    }
    
    public void add (String task){
        axhenda.add(task);
    }
    
    public void print(){
        for (int i=0; i<axhenda.size(); i++){
            System.out.println(i+1+": "+axhenda.get(i));
        }
    }
    
    public void remove(int number){
        axhenda.remove(number-1);
    }
}
