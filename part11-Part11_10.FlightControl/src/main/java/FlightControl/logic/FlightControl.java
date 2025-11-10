/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author KlantHalili
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class FlightControl {
    private HashMap<String, Airplane> planes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> fluturimet;
    
    public FlightControl(){
        this.places = new HashMap<>();
        this.fluturimet = new HashMap<>();
        this.planes = new HashMap<>();
    }
    
    public void addPlane(String ID, int capacity){
        Airplane plane = new Airplane(ID, capacity);
        planes.put(ID, plane);
    }
    
    
    public void addPlace(String ID){
        Place place = new Place(ID);
        places.put(ID, place);
    }
    
    public void addFlight(Airplane plane, String nisja, String mberritja){
        places.putIfAbsent(nisja, new Place(nisja));
        places.putIfAbsent(mberritja, new Place (mberritja));
        Flight fluturim = new Flight(places.get(nisja), places.get(mberritja) , plane);
        fluturimet.putIfAbsent(fluturim.toString(), fluturim);
    }
    
    public Collection<Airplane> getPlanes(){
        return this.planes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.fluturimet.values();
    }
    
    public Airplane getAirplane(String ID){
        return this.planes.get(ID);
    }
    
}
