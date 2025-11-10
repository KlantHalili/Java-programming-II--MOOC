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
public class MisplacingBox extends Box{
    private ArrayList <Item> kutiaMister;
    
    public MisplacingBox(){
        this.kutiaMister = new ArrayList <>();
    }
    
    public void add(Item item){
        kutiaMister.add(item);
    }
    
    public boolean isInBox(Item item){
        return false;
    }
    
}
