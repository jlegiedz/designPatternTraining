package bnsit.patterns.laboratory.model;

public class FakeBuildingCreator extends AbstractBuilder {


    @Override
    public Building build() {
        initialize("2", "3");
        addElevation(2);
        addRoom(12, 2);
        return building;
    }


}
