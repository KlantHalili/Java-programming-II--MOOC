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
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
public class Employees {
    private ArrayList<Person> punonjes;
    
    public Employees(){
        this.punonjes = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        punonjes.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        for(Person person: peopleToAdd){
            punonjes.add(person);
        }
    }
    
    public void print(){
        punonjes.stream()
                .forEach(p -> System.out.println(p));
    }
    
    public void print(Education education){
        Iterator<Person> iterator = punonjes.iterator();
        
        while (iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation()==education){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator <Person> iterator = punonjes.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
