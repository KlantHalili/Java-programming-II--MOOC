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
import java.util.HashMap;
import java.util.Map;
public class Flight {
    private Place nisja;
    private Place mberritja;
    private Airplane plane;
    
    public Flight(Place nisja, Place mberritja, Airplane plane){
        this.nisja = nisja;
        this.mberritja = mberritja;
        this.plane = plane;
        
    }
    
    public Airplane getAirplane(){
        return this.plane;
    }
    
    public Place getNisja(){
        return this.nisja;
    }
    
    public Place getMberritja(){
        return this.mberritja;
    }
    
    public String toString(){
        return this.plane.toString() + " ("+this.nisja+"-"+this.mberritja+")";
    }
}
