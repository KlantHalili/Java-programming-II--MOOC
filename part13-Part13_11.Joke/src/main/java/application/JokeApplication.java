package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    public void start(Stage stage){
        BorderPane paraqitja = new BorderPane();
        HBox butonat = new HBox();
        Button butoni1 = new Button("Joke");
        Button butoni2 = new Button("Answer");
        Button butoni3 = new Button("Explanation");
        butonat.setPadding(new Insets(20, 20, 20, 20));
        butonat.setSpacing(10);
        butonat.getChildren().addAll(butoni1, butoni2, butoni3);
        paraqitja.setTop(butonat);
        StackPane shakaja = createView("What do you call a bear with no teeth?");
        StackPane pergjigja = createView("A gummy bear.");
        StackPane shpjegimi = createView("Do e jap shpjegimin live, \n"
                + "virtualisht mund te humbasesh kohe");
        
        butoni1.setOnAction((event)->{
            paraqitja.setCenter(shakaja);
        });
        butoni2.setOnAction((event)->{
            paraqitja.setCenter(pergjigja);
        });
        butoni3.setOnAction((event)->{
            paraqitja.setCenter(shpjegimi);
        });
        
        paraqitja.setCenter(shakaja);
        
        Scene scene = new Scene(paraqitja);
        
        stage.setScene(scene);
        stage.show();
    }
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
