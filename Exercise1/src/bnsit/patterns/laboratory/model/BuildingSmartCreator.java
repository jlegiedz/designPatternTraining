package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingSmartCreator {

    private  BuilderStateContext state;
    private String name;
    private String address;
    private List<Elevation> elevations = new ArrayList<Elevation>();

    BuildingSmartCreator(){


    }
    public void addElevation(int number) {



    }

    public void addRoom(int roomNumber, int elevationNumber) {

    }
    public Building initialize(String name, String address) {
        Building building=new Building(name, address, elevations);
        return new ElevationBuilder();
    }

    public Building build() {

        return new Building(name, address, elevations);
    }


}
