/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helius
 */
import java.util.ArrayList;
import java.util.HashMap;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> regjistri;
    
    public VehicleRegistry(){
        this.regjistri = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if(!regjistri.containsKey(licensePlate)){
            regjistri.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    public String get(LicensePlate licensePlate){
    return regjistri.get(licensePlate);
}

    
    public boolean remove(LicensePlate licensePlate){
        if(regjistri.containsKey(licensePlate)){
            regjistri.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate plate : regjistri.keySet()) {
            System.out.println(plate);
}

    }
    
    public void printOwners(){
        ArrayList<String> pronaret = new ArrayList<>();
        for (String owners: regjistri.values()){
            if(!pronaret.contains(owners)){
                pronaret.add(owners);
            }
        }
        for (String pronari: pronaret){
            System.out.println(pronari);
        }
    }
}
