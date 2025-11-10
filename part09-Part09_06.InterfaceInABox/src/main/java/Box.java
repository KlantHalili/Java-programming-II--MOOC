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
public class Box implements Packable{
    private double maxWeight;
    private ArrayList <Packable> lista;
    
    public Box(double maxWeight){
        this.lista = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add(Packable packable){
        if(!(weight()+packable.weight()>=this.maxWeight)){
            lista.add(packable);
        }
    }
    
    public double weight(){
        double weight = 0;
        for (Packable paketat: lista){
            weight += paketat.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: "+this.lista.size()+" items, total weight "+weight()+" kg";
    }
}
