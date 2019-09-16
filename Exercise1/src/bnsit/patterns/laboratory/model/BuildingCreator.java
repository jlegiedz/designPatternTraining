package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingCreator {

    private String name;
    private String address;
    private List<Elevation> elevations = new ArrayList<Elevation>();


    public BuildingCreator(String name, String address, List<Elevation> elevations) {
        this.name = name;
        this.address = address;
        this.elevations = elevations;
    }

    public BuildingCreator() {


    }

    public void addElevation(int number) {
    }

    public Building initialize(String name, String address) {
        return new Building(name, address, elevations);
    }

    public void addRoom(int roomNumber, int elevationNumber) {

    }

    public BuildingCreator setName(String name) {
        this.name = name;
        return this;
    }

    public BuildingCreator setAddress(String address) {
        this.address = address;
        return this;
    }

    public BuildingCreator setElevations(List<Elevation> elevations) {
        this.elevations = elevations;
        return this;
    }


    public Building build() {

        return new Building(name, address, elevations);
    }


}
