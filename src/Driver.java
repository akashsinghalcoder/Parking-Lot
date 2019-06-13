
public class Driver {
	 ParkingManager parkingManager = new ParkingManager(5, 10, 10);
		
	
	public  void addVehicle(Vehicle vehicle) {
		ParkingSpot parkinglot = parkingManager.returnParkingSpot(vehicle);
		if(parkinglot != null ) {
			vehicle.parkingspot = parkinglot;
			System.out.println("Your car parking is " + parkinglot.parkingSpotNumber);
		} else {
			System.out.println("Car parking is full");
		}
		
	}
	
	public  void removeVehicle(Vehicle vehicle) {
		parkingManager.removeVehicle(vehicle);		
	}
	
	
	
	

}
