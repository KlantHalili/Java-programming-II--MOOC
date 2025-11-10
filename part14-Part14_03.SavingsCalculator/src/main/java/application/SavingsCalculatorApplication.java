package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    public void start(Stage stage) {
        // Main layout
        BorderPane layout = new BorderPane();
        layout.setPrefSize(500, 400);

        // Savings control layout
        BorderPane kursimet = new BorderPane();

        Slider kursimLine = new Slider(25, 250, 25);
        kursimLine.setShowTickMarks(true);
        kursimLine.setShowTickLabels(true);
        kursimLine.setMajorTickUnit(25);
        kursimLine.setMinorTickCount(3);
        kursimLine.setSnapToTicks(true);

        Label kursimVlera = new Label("" + kursimLine.getValue());

        kursimet.setLeft(new Label("Monthly savings"));
        kursimet.setCenter(kursimLine);
        kursimet.setRight(kursimVlera);
        kursimet.setPadding(new Insets(10));

        // Interest control layout
        BorderPane interesi = new BorderPane();

        Slider interesLine = new Slider(0, 10, 0);
        interesLine.setShowTickMarks(true);
        interesLine.setShowTickLabels(true);
        interesLine.setMinorTickCount(4);

        Label interesVlera = new Label("" + interesLine.getValue());

        interesi.setLeft(new Label("Yearly interest rate"));
        interesi.setCenter(interesLine);
        interesi.setRight(interesVlera);
        interesi.setPadding(new Insets(10));

        // Overall control layout
        VBox controls = new VBox();
        controls.getChildren().addAll(kursimet, interesi);

        // Chart creation
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Savings calculator");

        XYChart.Series kursimetGraph = new XYChart.Series();
        XYChart.Series interesiGraph = new XYChart.Series();

        chart.getData().addAll(kursimetGraph, interesiGraph);

        // Setting up layout
        layout.setTop(controls);
        layout.setCenter(chart);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Functionality
        kursimLine.valueProperty().addListener((observable, oldValue, newValue) -> {
            kursimVlera.setText("" + newValue.intValue());

            updateSavings(kursimLine.getValue(), interesLine.getValue(), kursimetGraph, interesiGraph);
        });
        interesLine.valueProperty().addListener((observable, oldValue, newValue) -> {
            interesVlera.setText("" + newValue.intValue());

            updateSavings(kursimLine.getValue(), interesLine.getValue(), kursimetGraph, interesiGraph);
        });

        updateSavings(kursimLine.getValue(), interesLine.getValue(), kursimetGraph, interesiGraph);
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

    private void updateSavings(double savings, double interestRate, XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 1; i <= 30; i++) {            
            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interestRate / 100.0);
            
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));
        }
    }
}