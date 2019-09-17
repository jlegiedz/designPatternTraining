package bnsit.patterns.laboratory.model;

public interface Creator {


    public void initialize(String name, String address) ;

    public void addElevation(int number);

    public void addRoom(int roomNumber, int elevationNumber) ;

    public Building build() ;

}
