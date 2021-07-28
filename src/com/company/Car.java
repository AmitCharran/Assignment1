package com.company;

public class Car extends Vehicle{
    private String model;
    private double acceleration;

    public Car(String color, String VIN, boolean automatic, String model, double acceleration) {
        super(color, VIN, automatic);
        this.model = model;
        this.acceleration = acceleration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String toString(){
        return "Car Model: " + model +
                "\nCar Color: " + getColor();
    }
}
