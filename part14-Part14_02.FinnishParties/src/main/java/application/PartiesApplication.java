package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.nio.file.*;
import java.util.*;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class PartiesApplication extends Application {

    private List<String> lines = new ArrayList<>();
    private HashMap<String, HashMap<Integer, Double>> data = new HashMap<>();

    @Override
    public void start(Stage stage) {
        Path path = Paths.get("partiesdata.tsv");

        try {
            lines = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split("\t");
            String party = parts[0];
            data.put(party, new HashMap<>());
        }
        String[] header = lines.get(0).split("\t");
        List<Integer> years = new ArrayList<>();
        for (int i = 1; i < header.length; i++) {
            years.add(Integer.parseInt(header[i]));
        }

        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split("\t");
            String party = parts[0];
            Map<Integer, Double> votes = data.get(party);

            for (int j = 1; j < parts.length; j++) {
                if (!parts[j].equals("-")) {
                    double vote = Double.parseDouble(parts[j]);
                    votes.put(years.get(j - 1), vote);
                }
            }
        }
        
        NumberAxis xAxis = new NumberAxis(1967, 2009, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        data.keySet().stream().forEach(party ->{
            XYChart.Series grafiku = new XYChart.Series();
            grafiku.setName(party);
            data.get(party).entrySet().stream().forEach(pair ->{
                grafiku.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(grafiku);
        });
        
        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}
