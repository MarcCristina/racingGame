package org.fasttrackit;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Race race = new Race();

        Track track = new Track();
        track.setLenght(100);

        race.setTrack (track);


        Engine engine = new Engine();
        engine.setManufacturer ("Volvo");

        Car car1 = new Car(engine);
        car1.setName("Volvo");
        car1.setColor("black");
        car1.setFuelLevel(100.0);
        car1.setMileage(13.5);
        car1.setDoorCount (4);

        Engine engine2 = new Engine();
        engine2.setManufacturer ("Mercedes");

        System.out.println("car is:" + car1.getName());

        Car car2 = new Car(engine2);
        car2.setName("Mercedes");
        car2.setColor("blue");
        car2.setFuelLevel(115.00);
        car2.setMileage(11.5);
        car2.setDoorCount (4);


        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(20.5);

        AutoVehicle autoVehicle = new AutoVehicle(new Engine());





    }


}
