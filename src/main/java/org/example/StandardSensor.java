package org.example;

public class StandardSensor implements Sensor {
    int temperature;

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        System.out.println("Standard Sensor is always on");
    }

    @Override
    public void setOff() {
        System.out.println("Standard Sensor is always on");
    }

    @Override
    public int read() {
        return this.temperature;
    }

    StandardSensor(int temp){
        this.temperature = temp;
    }

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
}

