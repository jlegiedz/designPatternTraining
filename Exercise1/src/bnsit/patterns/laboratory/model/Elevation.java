package bnsit.patterns.laboratory.model;

import bnsit.patterns.laboratory.model.Room;

import java.util.ArrayList;
import java.util.List;

public class Elevation {

	private int number;
	private List<Room> rooms = new ArrayList<>();

	public Elevation(int number) {
		this.number = number;
	}

	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public void addRoom(int roomNumber) {
		this.rooms.add(new Room(roomNumber));
	}

	public int getNumber() {
		return number;
	}
}