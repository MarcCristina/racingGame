package org.fasttrackit;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio control";

    private String name;
    private String color;
    private double currentSpeed;


    public void setName(String name) {
        this.name = name.trim();
    }

    public String getName() {
        return name;

    }


    public double accelerate(double speed) {
        System.out.println("Accelerate implementation from Autovehicle.");
        currentSpeed = currentSpeed += speed;
        return currentSpeed / 60;

    }

    public double accelerate(double speed, double time) {
        return 20;
    }

    public String getname() {
        return name;
    }

    public void getname(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public static String getControlType() {
        return CONTROL_TYPE;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
