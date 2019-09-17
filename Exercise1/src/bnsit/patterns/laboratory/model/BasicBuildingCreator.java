package bnsit.patterns.laboratory.model;
// to do- napisac z setterami

import java.util.ArrayList;
import java.util.List;

public class BasicBuildingCreator extends AbstractBuilder {

    public Building build() {
        return this.building;
    }


//    public BasicBuildingCreator setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public BasicBuildingCreator setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public BasicBuildingCreator setElevations(int number) {
//        addElevation(number);
//        return this;
//    }


}
