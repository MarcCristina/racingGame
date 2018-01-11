package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {

    private Track track;
    private List<Vehicle> competitors = new ArrayList<Vehicle>();
    private int competitorCount = 2;


    private String readVehicleName() {
        System.out.println("Please enter your vehicle's name.");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Your vehicle's name is : " + name);

        return name;

    }

    private double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter acceleration speed as a decimal number");

        Scanner scanner = new Scanner((System.in));

        double speed = 0;
        try {
            speed = scanner.nextDouble();
        } catch (InputMismatchException exception) {
//            throw new Exception("Please enter a valid decimal number");
            System.out.println("Please enter a valid decimal number");

            return readAccelerationSpeed();
        }

        System.out.println("You accelerated with" + speed + "km/h");

        return speed;
    }

    private void addCompetitor() {
        String vehicleName = readVehicleName();

        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleName);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(8, 20));

System.out.println("Your vehicle's mileage is:" + vehicle.getName());
        competitors.add(vehicle);
    }

    private void addA11Competitors() {
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();


        }
    }

    public void start() throws Exception {
        addA11Competitors();


        boolean noWinnerYet = true;

        while (noWinnerYet) {

            for (Vehicle vehicle : competitors) {
                double speed = readAccelerationSpeed();

                vehicle.accelerate(speed);

                if (vehicle.getTraveledDistance() >= track.getLenght()) {

                    System.out.println("The winner is : " + vehicle.getname());
                    noWinnerYet = false;

                }
            }

        }


    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }
}


//    private Vehicle[] competitors = new Vehicle[10];
//    private List <Vehicle> competitorList = new ArrayList<Vehicle>();
//
//
//
//
//    public void start() {
//        Engine engine = new Engine();
//        engine.setManufacturer("Volvo");
//
//        Vehicle firstCompetitor = createCompetitor(engine, "Mercedes", "red", 40, 8.5, 4);
//
//
//        Engine engine2 = new Engine();
//        engine2.setManufacturer("Toyota");
//
//        Vehicle secondCompetitor = createCompetitor(engine2, "Toyota", "red", 70, 10.6, 2);
//
//
//        secondCompetitor = createCompetitor(engine, "Honda", "black", 40, 10.5, 2);
//
//        competitors[0] = firstCompetitor;
//        competitors[1] = secondCompetitor;
//
//        for (int i = 0; i < competitors.length; i++) {
//
//            if (competitors[i] != null) {
//                System.out.println("Competitor " + i + ": " + competitors[i].getName());
//            }
//
//        }
//        // examples for reading and writing list elements
//        competitorList.get(0);
//        competitorList.add(new Vehicle());
//        competitorList.add(1 , new Vehicle());
//
//
//        // enhanced for
//        for (Vehicle vehicle : competitors){
//            if (vehicle != null){
//                System.out.println(vehicle.getName());
//
//            }
//        }
//    }
//
//
//    // parameters contain car prefix just to demo they can have any name
//    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount) {
//        Car competitor = new Car(carEngine);
//        competitor.setName(carName);
//        competitor.setColor(carColor);
//        competitor.setFuelLevel(carFuelLevel);
//        competitor.setMileage(carMileage);
//        competitor.setDoorCount(carDoorCount);
//
//        return competitor;
//
//    }
//
//
//    public Track getTrack() {
//        return track;
//    }
//
//    public void setTrack(Track track) {
//        this.track = track;
//    }
//}
