package bnsit.patterns.laboratory.model;

public class RoomBuilder {

    ElevationBuilder addElevation(int numberElevation){
        return new ElevationBuilder();
    }
    RoomBuilder addRoom (int room){
        return new RoomBuilder();
    }

}
