package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application{

    
    public void start(Stage stage){
        Button buttoncomp = new Button("Shtype kete");
        Label labelcomp = new Label("Shtyp majtas");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(buttoncomp);
        componentGroup.getChildren().add(labelcomp);
        
        Scene view = new Scene(componentGroup);
        
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
