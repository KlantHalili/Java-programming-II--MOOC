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
import java.util.Scanner;
public class UserInterface {
    private TodoList dita;
    private Scanner scanner;
    
    public UserInterface(TodoList toDo, Scanner scanner){
        this.dita = toDo;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            } else if (input.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                dita.add(toAdd);
            } else if (input.equals("list")){
                dita.print();
            } else if (input.equals("remove")){
                System.out.println("Which one is removed?");
                int numri = scanner.nextInt();
                dita.remove(numri);
            }
            
                System.out.println("Not a valid command");
            
        }
    }
}
