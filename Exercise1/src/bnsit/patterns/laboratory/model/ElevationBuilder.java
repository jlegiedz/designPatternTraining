package bnsit.patterns.laboratory.model;

public class ElevationBuilder extends Building {

    public ElevationBuilder(String name, String address) {
        super(name, address);
    }

    public ElevationBuilder() {
        super();
    }

    public RoomBuilder addElevation(int numberElevation){
        return new RoomBuilder();
    }


}
