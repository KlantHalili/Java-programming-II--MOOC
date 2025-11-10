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
public class Abbreviations {
    HashMap<String, String> shkurtesat;
    
    public Abbreviations(){
        this.shkurtesat = new HashMap<>();
    }
    public void addAbbreviation(String shkurtesa, String shpjegimi){
        shkurtesat.put(shkurtesa, shpjegimi);
    }
    
    public boolean hasAbbreviation(String shkurtesa){
        if(shkurtesat.containsKey(shkurtesa)){
            return true;
        }
        return false;
    }
    public void getShpjegim(String shkurtesa){
        System.out.println(shkurtesat.get(shkurtesa));
    }
    public String findExplanationFor(String shkurtesa){
        if(!hasAbbreviation(shkurtesa)){
            return null;
        }
        return shkurtesat.get(shkurtesa);
    }
}
