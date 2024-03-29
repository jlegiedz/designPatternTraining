package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;


public class Elevation {

	private int number;
	private List<Room> rooms = new ArrayList<Room>();
	
	public Elevation(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public List<Room> getRooms() {
		return rooms;
	}
}
