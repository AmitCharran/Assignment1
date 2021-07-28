package com.company;

public class Vehicle {
    protected String color;
    private String VIN;
    private boolean automatic;

    public Vehicle(String color, String VIN, boolean automatic){
        this.color = color;
        this.VIN = VIN;
        this.automatic = automatic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
}
