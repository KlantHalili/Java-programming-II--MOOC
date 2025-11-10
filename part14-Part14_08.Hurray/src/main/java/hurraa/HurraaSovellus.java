package hurraa;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

        nappi.setOnAction((event) -> {
            try {
                File soundFile = new File("Applause-Yannick_Lemieux.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Scene scene = new Scene(pane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
