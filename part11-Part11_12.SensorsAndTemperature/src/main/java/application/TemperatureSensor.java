/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;

/**
 *
 * @author Helius
 */
public class TemperatureSensor implements Sensor{
    private boolean gjendja;
    
    public TemperatureSensor (){
        this.gjendja = false;
    }
    
    public boolean isOn(){
        return gjendja;
    }
    
    public void setOn(){
    gjendja = true;
    }
    
    public void setOff(){
    gjendja = false;}
    
    public int read(){
        if(isOn()){
            return new Random().nextInt(61)-30;
        } else {
            throw new IllegalStateException();
        }
    }
}
