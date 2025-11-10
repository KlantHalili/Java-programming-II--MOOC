/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    private List<Item> lista;
    
    public ShoppingCart(){
        this.lista = new ArrayList<>();
    }
    
    public void add (String product, int price){
        boolean eshte = false;
        for(Item itemi: lista){
            if(itemi.getName().equals(product)){
                itemi.increaseQuantity();
                eshte = true;
                break;
            }
        }
        if(!eshte){
            lista.add(new Item(product, 1, price));
        } else {
            return;
        }
    }
    
    public int price(){
        int price =0;
        for (Item item: lista){
            price += item.price();
        }
        return price;
    }
    
    public void print(){
        for(Item item: lista){
            System.out.println(item);
        }
    }
}
