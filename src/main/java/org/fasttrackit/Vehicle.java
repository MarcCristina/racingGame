package org.fasttrackit;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio control" ;
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;

    }

    public String getColor() {
        return color;
    }

    public double accelerate(double speed) {

        System.out.println(speed);

        return 10.1;
    }

}
