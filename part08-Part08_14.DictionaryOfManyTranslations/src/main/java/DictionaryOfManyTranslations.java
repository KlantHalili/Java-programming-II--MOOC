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

public class DictionaryOfManyTranslations {
private HashMap<String, ArrayList<String>> fjalori;    

public DictionaryOfManyTranslations(){
    this.fjalori = new HashMap<>();
}

public void add(String word, String translation){
    this.fjalori.putIfAbsent(word, new ArrayList<>());
    ArrayList<String> lista = this.fjalori.get(word);
    lista.add(translation);
}

public ArrayList<String> translate (String word){
    if (fjalori.containsKey(word)){
        if(fjalori.get(word).isEmpty()){
        return new ArrayList<>();
        }
        return fjalori.get(word);
    } 
    return new ArrayList<>();
}

public void remove(String word){
    this.fjalori.remove(word);
}
}
