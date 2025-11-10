package textstatistics;

import java.util.Arrays;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    public void start(Stage stage){
        HBox fundi = new HBox();
        fundi.setSpacing(10);
        Label letters = new Label();
        Label words = new Label();
        Label longest = new Label();
        fundi.getChildren().addAll(letters, words, longest);
        
        
        TextArea fusha = new TextArea();
        fusha.textProperty().addListener((change, oldValue, newValue)->{
            int characters = newValue.length();
            letters.setText("Letters: "+characters);
            String[] word = newValue.split(" ");
            words.setText("Words: "+word.length);
            String egjata = Arrays.stream(word)
                    .sorted((s1, s2)-> s2.length()-s1.length())
                    .findFirst()
                    .get();
            longest.setText("The longest word is: "+egjata);
            
        });
        
        BorderPane pane = new BorderPane();
        pane.setCenter(fusha);
        pane.setBottom(fundi);
        Scene scene = new Scene(pane);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
