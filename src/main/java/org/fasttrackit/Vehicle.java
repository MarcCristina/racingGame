package org.fasttrackit;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio control" ;
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getName() {
        return name;

    }


    public double accelerate(double speed) {

        System.out.println(speed);

        return 10.1;

    }

    public double accelerate (double speed, double time) {
        return 20;
    }
    public  String getname(){ return name; }

    public void getname (String name) { this.name = name.trim(); }

    public String getColor() { return color; }

    public void setColor (String color) { this.color = color; }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
