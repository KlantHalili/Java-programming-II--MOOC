package FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl asda = new FlightControl();
        TextUI ui = new TextUI(asda, scanner);
        ui.startAssetControl();
        System.out.println("////////////////");
        ui.startFlightControl();
    }
}
