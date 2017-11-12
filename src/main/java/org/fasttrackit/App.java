package org.fasttrackit;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {
        Race race = new Race();
        Track track = new Track();
        track.lenght = 105.5;
        race.track = track;
        Engine engine = new Engine();
        engine.manufacturer = "Volvo";

        Car car1 = new Car();
        car1.name = "Volvo";
        car1.color = "black";
        car1.fuelLevel = 100.00;
        car1.mileage = 12.5;
        car1.doorCount = 4;
        car1.engine = engine;

        Engine engine2 = new Engine();
        engine2.manufacturer = "Mercedes";


        Car car2 = new Car();
        car2.name = "Mercedes";
        car2.color = "blue";
        car2.fuelLevel = 115.00;
        car2.mileage = 11.5;
        car2.doorCount = 4;
        car2.engine = engine2;



    }


}
