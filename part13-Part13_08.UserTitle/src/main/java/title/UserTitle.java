package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    public void start(Stage stage){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the title for the application window:");
        String input = scanner.nextLine();
        stage.setTitle(input);
        stage.show();
    }

}
