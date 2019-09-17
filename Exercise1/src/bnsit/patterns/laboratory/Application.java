package bnsit.patterns.laboratory;

import java.io.IOException;
import java.util.Scanner;

import bnsit.patterns.laboratory.model.*;


public class Application {

	private static final String HELLO_MESSAGE = "Welcome to Equipment Evidence System.";
	private boolean running = false;
	private ApplicationModel model = new ApplicationModel();
	
	public void run() {
		running = true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(HELLO_MESSAGE);
		
		while (running) {
			System.out.print("ees> ");
			String command = scanner.nextLine();
			if (command.equals("hello")) {
				System.out.println(HELLO_MESSAGE);
			} else if (command.startsWith("save")) {
				String filename = command.split(" ")[1]; 
				try {
					model.save(filename);
				} catch (IOException e) {
					System.out.println("Model saving failure.");
				}
			} else if (command.startsWith("load")) {
				String filename = command.split(" ")[1]; 
				try {
					model.load(filename);
				} catch (IOException e) {
					System.out.println("Model loading failure.");
				}
			}else if (command.equals("add_building")) {
				System.out.print("Podaj nazwę");
				String name = scanner.nextLine();

				System.out.println("Podaj address");
				String address = scanner.nextLine();
				BasicBuildingCreator creator = new BasicBuildingCreator();
				 creator.initialize(name, address);

				System.out.println("Podaj zakres pięter");
				String elevationRangeInput = scanner.nextLine();
				int firstElevation = Integer.parseInt(elevationRangeInput.split(" ")[0]);
				int lastElevation = Integer.parseInt(elevationRangeInput.split(" ")[1]);

				for(int i = firstElevation; i <= lastElevation; ++i) {
					creator.addElevation(i);

					System.out.println("Podaj pokoje dla piętra: " + i);
					String[] roomsInput = scanner.nextLine().split(" ");

					for(String roomInput : roomsInput) {
						creator.addRoom(Integer.parseInt(roomInput), i);
					}


				}

				Building b = creator.build();
				System.out.println(b);
			}
			else if(command.equals("fake")){
				AbstractBuilder creator =  new FakeBuildingCreator();
				Building building=creator.build();

				System.out.println(building);
			}
//			else if (command.equals("add_building2")) {
//				BuildingCreator buildingCreator = new BuildingCreator();
//				System.out.print("Podaj nazwę");
//				String name = scanner.nextLine();
//
//				System.out.println("Podaj address");
//				String address = scanner.nextLine();
//
//				buildingCreator.initialize(name, address);
//
//				System.out.println("Podaj zakres pięter");
//				String elevationRangeInput = scanner.nextLine();
//				buildingCreator.createAllElevations(elevationRangeInput);
//
//				while (buildingCreator.hasNextElevation()) {
//					buildingCreator.moveToNextElevation();
//					System.out.println("Podaj pokoje dla piętra: " + buildingCreator.getCurrentElevationNumber());
//					buildingCreator.addAllRooms(scanner.nextLine());
//
//				}
//			}

			else if (command.equals("exit")) {
				running = false;
			}
		}
		

	}
	
	public void stop() {
		running = false;
	}	
	
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}
}
