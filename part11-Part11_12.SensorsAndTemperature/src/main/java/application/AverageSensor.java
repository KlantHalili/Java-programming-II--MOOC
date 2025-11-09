package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensoret;
    private List<Integer> pastReadings;

    public AverageSensor() {
        this.sensoret = new ArrayList<>();
        this.pastReadings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensoret.add(toAdd);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensoret) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensoret) {
            sensor.setOff();
        }
    }

    @Override
    public boolean isOn() {
        return sensoret.stream().allMatch(Sensor::isOn);
    }

    @Override
    public int read() {
        if (!isOn() || sensoret.isEmpty()) {
            throw new IllegalStateException();
        }

        double avg = sensoret.stream()
                             .mapToInt(Sensor::read)
                             .average()
                             .orElseThrow(() -> new IllegalStateException("No readings available"));

        int rounded = (int) Math.floor(avg);
        pastReadings.add(rounded);
        return rounded;
    }

    public List<Integer> readings() {
        return new ArrayList<>(pastReadings);
    }
}
