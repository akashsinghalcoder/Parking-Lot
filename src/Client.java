
public class Client {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle1 = new Truck();
		
		driver.addVehicle(vehicle1);
		
		Vehicle vehicle2 = new Truck();
		driver.addVehicle(vehicle2);
		driver.removeVehicle(vehicle1);
		
		
		
		Vehicle vehicle3 = new Truck();
		driver.addVehicle(vehicle3);
		

	}

}
