/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
public class Book {
    private String name;
    private int rekomandimi;
    
    public Book (String name, int rec){
        this.name = name;
        this.rekomandimi = rec;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.rekomandimi;
    }
    
    public String toString(){
        return this.name+"(recommended for "+ this.rekomandimi+" year-olds or older)";
    }
}
