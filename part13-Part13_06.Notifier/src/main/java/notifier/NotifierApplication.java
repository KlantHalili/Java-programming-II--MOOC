package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage stage) {
        TextField field = new TextField();
        Button click = new Button("Update");
        Label area = new Label();

        click.setOnAction(event -> {
            area.setText(field.getText());
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(field, click, area);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
}
