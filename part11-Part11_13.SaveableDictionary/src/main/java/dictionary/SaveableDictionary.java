/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author KlantHalili
 */
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String fileName;
    
    public SaveableDictionary() {
    this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this();
        this.fileName = file;
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(this.fileName))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[] eNdare = row.split(":");
                dictionary.put(eNdare[0], eNdare[1]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public boolean save() {
    try (PrintWriter writer = new PrintWriter(this.fileName)) {
        HashMap<String, String> saved = new HashMap<>();

        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key);

            // Avoid saving both key:value and value:key
            if (!saved.containsKey(value)) {
                writer.println(key + ":" + value);
                saved.put(key, value);
            }
        }

        return true;
    } catch (Exception e) {
        return false;
    }
}

    
    public void add(String words, String translation){
        if(dictionary.containsKey(words)){
            return;
        } else {
            dictionary.put(words, translation);
        }
    }
    
    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        for (String string: dictionary.keySet()){
            if(word.equals(dictionary.get(string))){
                return string;
            }
        }
        return null;
    }
    
    public void delete(String word){
        if(dictionary.containsKey(word)){
            dictionary.remove(word);
        }
        
        if(dictionary.containsValue(word)){
            String key = "";
            for(String string: dictionary.keySet()){
                if(dictionary.get(string).equals(word)){
                    key = string;
                }
            }
            dictionary.remove(key);
        }
    }
}
