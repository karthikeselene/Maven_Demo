package builder.design.pattern.demo;

public class ClientApplication {

	public static void main(String[] args) {
		/*** House house = new House();
		house.createBasement();
		house.createKitchen();
		house.createRooms();
		
		CarParking carParking = new CarParking();
		carParking.createBasement();
		carParking.createKitchen();
		carParking.createRooms();
		carParking.createCarParking();
		
		SwimmingPool sp = new SwimmingPool();
		sp.createBasement();	
		sp.createKitchen();
		sp.createRooms();
		sp.createSwimmingPool(); ***/
		
		new BulidHouse()
		.createBasement()
		.createKitchen()
		.createRooms();
		
		new BulidHouse()
		.createBasement()
		.createKitchen()
		.createRooms()
		.createSwimmingPool();
		
		new BulidHouse()
		.createBasement()
		.createKitchen()
		.createRooms()
        .createCarParking();
		
		new BulidHouse()
		.createBasement()
		.createKitchen()
		.createRooms()
		.createSwimmingPool()
		.createCarParking();
		
	}

}