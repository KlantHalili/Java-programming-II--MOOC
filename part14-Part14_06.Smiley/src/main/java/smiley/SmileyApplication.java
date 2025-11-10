package smiley;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{
    
    public void start(Stage stage){
        BorderPane layout = new BorderPane();
        Canvas painting = new Canvas(800, 800);
        GraphicsContext gc = painting.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, painting.getWidth(), painting.getHeight());
        gc.setFill(Color.BLACK);
        gc.fillRect(200, 200, 100, 100);
        gc.fillRect(500, 200, 100, 100);
        gc.fillRect(100, 500, 100, 100);
        gc.fillRect(200, 600, 100, 100);
        gc.fillRect(300, 600, 100, 100);
        gc.fillRect(400, 600, 100, 100);
        gc.fillRect(500, 600, 100, 100);
        gc.fillRect(600, 500, 100, 100);
        
        layout.setCenter(painting);
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
}

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }

}
