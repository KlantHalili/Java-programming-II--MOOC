/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author KlantHalili
 */
public class Airplane {
    private String ID;
    private int capacity;
    
    public Airplane(String ID, int kapaciteti){
        this.ID = ID;
        this.capacity = kapaciteti;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public String toString(){
        return this.ID + " ("+this.capacity+ " capacity)";
    }
}
