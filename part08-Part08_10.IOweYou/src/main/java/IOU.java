/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> iOweYou;
    
    public IOU(){
        this.iOweYou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        iOweYou.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        if (!iOweYou.containsKey(toWhom)){
            return 0;
        }
        return iOweYou.get(toWhom);
    }
    
}
