/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
import java.util.ArrayList;
public class Herd implements Movable{
    private ArrayList <Movable> tufa;
    
    public Herd(){
        this.tufa = new ArrayList<>();
    }
    
    public String toString(){
        String result = "";
        for (Movable organism: tufa){
            result += organism +"\n";
        }
        return result;
    }
    
    public void addToHerd(Movable movable){
        tufa.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable movable: tufa){
            movable.move(dx, dy);
        }
    }
}
