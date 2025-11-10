/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;
public class Hand implements Comparable<Hand>{
     private ArrayList<Card> dora;
    
    public Hand(){
        this.dora = new ArrayList<>();
    }
    
    public void add(Card card){
        dora.add(card);
    }
    
    public void print(){
        dora.stream()
                .forEach(p-> System.out.println(p));
    }
    
    public void sort(){
        dora.sort(null);
    }
    
    public int compareTo(Hand hand){
        int kjo = 0;
        int tjetra = 0;
        for (Card card: this.dora){
            kjo += card.getValue();
        }
        for (Card card: hand.dora){
            tjetra += card.getValue();
        }
        if (kjo == tjetra){
            return 0;
        } else {
            return kjo - tjetra;
        }
    }
    
    public void sortBySuit(){
        Comparator comparator = new BySuitInValueOrder();
        dora.sort(comparator);
    }
}
