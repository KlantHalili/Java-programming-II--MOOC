package borderpane;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public void start(Stage stage){
        Label label1 = new Label("NORTH");
        Label label2 = new Label("EAST");
        Label label3 = new Label("SOUTH");
        
        BorderPane pane = new BorderPane();
        pane.setTop(label1);
        pane.setBottom(label3);
        pane.setRight(label2);
        
        Scene view = new Scene(pane);
        stage.setScene(view);
        stage.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

}
