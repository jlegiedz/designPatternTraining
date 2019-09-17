package bnsit.patterns.laboratory.model;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String name;
	private String address;
	private List<Elevation> elevations = new ArrayList<Elevation>();

	public Building(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Building(){

	}

	public Building(String name, String address, List<Elevation> elevations) {
		this.name = name;
		this.address = address;
		this.elevations = elevations;
	}

	public void addElevation(Elevation elevation) {
		this.elevations.add(elevation);
	}

	public Elevation getElevation(final int elevationNumber) {
		return this.elevations.stream()
				.filter(elevation -> elevation.getNumber() == elevationNumber)
				.findFirst().orElse(null);

	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Elevation> getElevations() {
		return elevations;
	}


	@Override
	public String toString() {
		return "Building{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", elevations=" + elevations +
				'}';
	}







}
