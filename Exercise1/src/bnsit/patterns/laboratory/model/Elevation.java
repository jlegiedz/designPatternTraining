package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;

public class Elevation {

	private int number;
	private List<Room> rooms = new ArrayList<Room>();

	public Elevation(int i) {
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public void addRoom(Room room) {
	}
}
