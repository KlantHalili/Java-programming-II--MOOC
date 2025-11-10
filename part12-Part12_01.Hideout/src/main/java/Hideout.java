/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
public class Hideout <T> {
    private T element;
    
    
    public void putIntoHideout(T toHide){
            this.element = toHide;
    }
    
    public T takeFromHideout(){
        T elementt = this.element;
        this.element = null;
        return elementt;
    }
    
    public boolean isInHideout(){
        return (!(this.element == null));
    }
    
    public String toString(){
        return (String)this.element;
    }
}
