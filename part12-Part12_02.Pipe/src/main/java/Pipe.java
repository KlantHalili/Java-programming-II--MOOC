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
public class Pipe <T>{
    private ArrayList<T> stack;
    
    public Pipe(){
        this.stack=new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        stack.add(value);
    }
    
    public T takeFromPipe(){
        if(stack.isEmpty()){
            return null;
        }
        T element = stack.get(0);
        stack.remove(0);
        return element;
    }
    
    public boolean isInPipe(){
        return (!stack.isEmpty());
    }
    
    
}
