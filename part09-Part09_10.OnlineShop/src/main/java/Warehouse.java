/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class Warehouse {
    private Map<String, Integer> magazina;
    private Map<String, Integer> stocks;
    
    public Warehouse(){
        this.magazina = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.magazina.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(!magazina.containsKey(product)){
            return -99;
        } else {
            return magazina.get(product);
        }
    }
    
    public int stock(String product){
        if(!stocks.containsKey(product)){
            return 0;
        } else {
            return stocks.get(product);
        }
    }
    
    public boolean take(String product) {
    if (!stocks.containsKey(product) || stocks.get(product) <= 0) {
        return false;
    } else {
        stocks.put(product, stocks.get(product) - 1);
        return true;
    }
}
    
    public Set<String> products(){
        return magazina.keySet();
    }

}
