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
public class ChangeHistory {
    private ArrayList<Double> historiku;
    
    public ChangeHistory(){
        this.historiku = new ArrayList<>();
    }
    
    public void add(double status){
        historiku.add(status);
    }
    
    public void clear(){
        historiku.clear();
    }
    
    public String toString(){
        return historiku.toString();
    }
    
    public double maxValue(){
        if(historiku.isEmpty()){
            return 0;
        } else {
        double vlera = 0;
        for( double maxvlera: historiku){
            if (maxvlera > vlera){
                vlera=maxvlera;
            }
        }
        return vlera;
    }
    }
    
    public double minValue(){
        if (historiku.isEmpty()){
            return 0;
        } else {
        double vlera = historiku.get(0);
        for( double minvlera: historiku){
            if (minvlera < vlera){
                vlera=minvlera;
            }
        }
        return vlera;
    }
    }
    
    public double average(){
        double sum = 0;
        if(historiku.isEmpty()){
            return 0;
        } else {
            for (double vlera: historiku){
                sum += vlera;
            }
        }
        return sum/(historiku.size());
    }
}
