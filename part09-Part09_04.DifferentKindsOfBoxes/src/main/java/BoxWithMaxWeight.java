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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> kutia;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.kutia = new ArrayList<>();
    }
    public int pesha(){
        int pesha = 0;
        for(Item item:kutia){
            pesha += item.getWeight();
        }
        return pesha;
    }
    
    public void add(Item item){
        if(item.getWeight()+pesha()<=capacity){
            kutia.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        for (int i=0; i<kutia.size(); i++){
            if(item.equals(kutia.get(i))){
                return true;
            }
        }
        return false;
    }
    
}
