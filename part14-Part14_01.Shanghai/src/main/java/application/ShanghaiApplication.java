package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        Label headLabel = new Label();
        GridPane gridi = new GridPane();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                gridi.add(new Button(), i, j);
            }
        }
        layout.setTop(headLabel);
        layout.setCenter(gridi);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }

}
