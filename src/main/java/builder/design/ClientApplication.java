package builder.design;

public class ClientApplication {

	public static void main(String[] args) {
		CarParking house = new CarParking();
		house.createBasement();
		house.createKitchen();
		house.createCarPaking();
	}

}