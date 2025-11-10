/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KlantHalili
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int rroga){
        super(name, address);
        this.salary = rroga;
    }
    
    public int salary(){
        return this.salary;
    }
    
    public String toString(){
        return super.toString()+"\n"+"  salary "+salary()+" euro/month";
    }
}
