/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author KlantHalili
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private FlightControl flightcontrol;
    
    public TextUI(FlightControl flightcontrol, Scanner scanner){
        this.flightcontrol = flightcontrol;
        this.scanner = scanner;
    }
    
    public void startAssetControl(){
        System.out.println("Airport Asset Control (AAC)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print(">");
            String answer = scanner.nextLine();
            if (answer.equals("1")){
                addAirplane();
            } else if (answer.equals("2")){
                addFluturim();
            } else if(answer.equals("x")){
                break;
            }
        }
    }
    
    public void addAirplane(){
        System.out.println("Give the airplane id: ");
        String ID = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        this.flightcontrol.addPlane(ID, n);
    }
    
    public void addFluturim(){
        System.out.println("Give the airplane id: ");
        String plane = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String nisja = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String mberritja = scanner.nextLine();
        this.flightcontrol.addFlight(flightcontrol.getAirplane(plane), nisja, mberritja);
    }
    
    public void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("~~~~~~~~~~~~~~");
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print(">");
            String input = scanner.nextLine();
            if(input.equals("1")){
                printPlanes();
            } else if(input.equals("2")){
                printFlights();
            } else if(input.equals("3")){
                System.out.println("Give the airplane id:");
                String n = scanner.nextLine();
                printPlane(n);
            } else if(input.equals("x")){
                break;
            }
        }
    }
    
    public void printPlanes(){
        for(Airplane plane: flightcontrol.getPlanes()){
            System.out.println(plane);
        }
    }
    
    public void printFlights(){
        for(Flight flight: flightcontrol.getFlights()){
            System.out.println(flight);
        }
    }
    
    public void printPlane(String id) {
    Airplane plane = flightcontrol.getAirplane(id);

    if (plane == null) {
        System.out.println("Plane not found!");
    } else {
        System.out.println(plane);
    }
}

}
