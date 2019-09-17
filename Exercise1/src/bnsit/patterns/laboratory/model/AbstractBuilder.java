package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBuilder {

    protected Building building;

    protected String name;
    protected String address;
    protected List<Elevation> elevations = new ArrayList<Elevation>();

    public void initialize(String name, String address) {
        this.building = new Building(name, address);
    }

    public void addElevation(int number) {

        building.addElevation(new Elevation(number));

    }

    public void addRoom(int roomNumber, int elevationNumber) {
        building.getElevation(roomNumber).addRoom(elevationNumber);
    }

    public abstract Building build();
}
