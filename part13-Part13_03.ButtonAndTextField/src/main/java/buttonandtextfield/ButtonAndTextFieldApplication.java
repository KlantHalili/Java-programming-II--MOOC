package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application{
    
    Button butoni = new Button("Shtype prap");
    TextField fusha = new TextField();
    
    public void start(Stage stage){
        FlowPane comp = new FlowPane();
        comp.getChildren().add(butoni);
        comp.getChildren().add(fusha);
        
        Scene view = new Scene(comp);
        stage.setScene(view);
        stage.show();
    }
    


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
