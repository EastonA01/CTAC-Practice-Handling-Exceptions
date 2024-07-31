package org.example;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }


    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        try {
            if(isOn){
                int rand = new Random().nextInt(61);
                rand = rand - 30;
                return rand;
            }
            else{
                throw new IllegalStateException("Sensor is not on");
            }

        }catch (IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        sensor.setOn();
        System.out.println(sensor.read());

    }
}
