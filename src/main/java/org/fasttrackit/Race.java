package org.fasttrackit;

public class Race {

    private Track track;
    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start (){
        Engine engine = new Engine();
        engine.setManufacturer ("Volvo");

        firstCompetitor = createCompetitor( engine,"Mercedes", "red", 40, 8.5, 4 );

        Engine secondEngine = new Engine();
        secondEngine.setManufacturer ("Toyota");

        secondCompetitor = createCompetitor(engine, "Honda", "black", 40, 10.5, 2 );


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
