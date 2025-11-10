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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> magazina;
    
    public StorageFacility(){
        this.magazina = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.magazina.putIfAbsent(unit, new ArrayList<>());
        ArrayList <String> items = this.magazina.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(magazina.containsKey(storageUnit)){
            if(!magazina.get(storageUnit).isEmpty()){
                return magazina.get(storageUnit);
            }
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        if (magazina.containsKey(storageUnit)){
            if(!magazina.get(storageUnit).isEmpty()){
                for(String itemi: magazina.get(storageUnit)){
            if (itemi.equals(item)){
                magazina.get(storageUnit).remove(item);
                if (magazina.get(storageUnit).isEmpty()){
                    magazina.remove(storageUnit);
                }
                break;
            }
        }
            } else {
                magazina.remove(storageUnit);
            }
        } else {
            System.out.println("Not a unit on the facility!");
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> listaa = new ArrayList<>();
        for (String units: magazina.keySet()){
            if (!magazina.get(units).isEmpty()){
                listaa.add(units);
            }
        }
        return listaa;
    }
}
