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
public class OneItemBox extends Box{
    private Item item;
    private ArrayList<Item> kutia;
    
    public OneItemBox(){
        this.kutia = new ArrayList<>();
    }
    
    public void add (Item item){
        if(kutia.isEmpty()){
            kutia.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        if(kutia.contains(item)){
            return true;
        }
        return false;
    }
}
