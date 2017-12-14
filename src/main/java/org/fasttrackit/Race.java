package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private Track track;
    private Vehicle[] competitors = new Vehicle[10];
    private List <Vehicle> competitorList = new ArrayList<Vehicle>();




    public void start() {
        Engine engine = new Engine();
        engine.setManufacturer("Volvo");

        Vehicle firstCompetitor = createCompetitor(engine, "Mercedes", "red", 40, 8.5, 4);


        Engine engine2 = new Engine();
        engine2.setManufacturer("Toyota");

        Vehicle secondCompetitor = createCompetitor(engine2, "Toyota", "red", 70, 10.6, 2);


        secondCompetitor = createCompetitor(engine, "Honda", "black", 40, 10.5, 2);

        competitors[0] = firstCompetitor;
        competitors[1] = secondCompetitor;

        for (int i = 0; i < competitors.length; i++) {

            if (competitors[i] != null) {
                System.out.println("Competitor " + i + ": " + competitors[i].getName());
            }

        }
        // examples for reading and writing list elements
        competitorList.get(0);
        competitorList.add(new Vehicle());
        competitorList.add(1 , new Vehicle());


        // enhanced for
        for (Vehicle vehicle : competitors){
            if (vehicle != null){
                System.out.println(vehicle.getName());

            }
        }
    }


    // parameters contain car prefix just to demo they can have any name
    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount) {
        Car competitor = new Car(carEngine);
        competitor.setName(carName);
        competitor.setColor(carColor);
        competitor.setFuelLevel(carFuelLevel);
        competitor.setMileage(carMileage);
        competitor.setDoorCount(carDoorCount);

        return competitor;

    }


    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}
