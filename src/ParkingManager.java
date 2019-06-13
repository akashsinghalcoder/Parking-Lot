import java.util.HashMap;

public class ParkingManager {
	Small [] smallParkings;
	Compact [] compactParkings;
	Large [] largeParkings;
	
	HashMap<Vehicle, Integer> mapperSmall;
	HashMap<Vehicle, Integer> mapperCompact;
	HashMap<Vehicle, Integer> mapperLarge;
	
	
	ParkingManager(int smallParkings, int compactParkings,int largeParkings) {
		this.smallParkings = new Small[smallParkings];
		for(int i=0;i<this.smallParkings.length ; i++) {
			this.smallParkings[i] = new Small(i);
		}
		this.compactParkings = new Compact[compactParkings];
		for(int i=0;i<this.compactParkings.length ; i++) {
			this.compactParkings[i] = new Compact(i);
		}
		
		this.largeParkings = new Large[largeParkings];
		
		for(int i=0;i<this.compactParkings.length ; i++) {
			this.largeParkings[i] = new Large(i);
		}
		
		mapperSmall = new HashMap<Vehicle, Integer>();
		mapperCompact = new HashMap<Vehicle, Integer>();
		mapperLarge = new HashMap<Vehicle, Integer>();

	}
	
	
	public ParkingSpot returnParkingSpot(Vehicle vehicle) {

		if(vehicle.size == Size.Bike) {
			int value = findParkingSpot(this.smallParkings);
			if(value != -1) {
				mapperSmall.put(vehicle, value);
				smallParkings[value].setIsAssigned(true);  
				return this.smallParkings[value];
			} else {
				return null;
			}
			
		} else if(vehicle.size == Size.Car) {
			int value = findParkingSpot(this.compactParkings);
			if(value != -1) {
				mapperCompact.put(vehicle, value);
				compactParkings[value].setIsAssigned(true);  

				return this.compactParkings[value];
			} else {
				return null;
			}
			
		} else if(vehicle.size == Size.Truck) {
			int value = findParkingSpot(this.largeParkings);
			if(value != -1) {
				mapperLarge.put(vehicle, value);

				largeParkings[value].setIsAssigned(true);  
				return this.largeParkings[value];
			} else {
				return null;
			
			}		
		}

		return null;
	}
	
	private int findParkingSpot(ParkingSpot [] parkingspots) {
		for(int i=0 ;i < parkingspots.length ; i++) {
			if(parkingspots[i].getIsAssigned() == false) {
				return i;
			}
			
		}
		return -1;
	}
	
	public void removeVehicle(Vehicle vehicle) {
		if(vehicle.size == Size.Bike) {
			Integer parkingNumber = mapperSmall.get(vehicle);
			if(parkingNumber == null) {
				System.out.print("Vehicle is not present");
			} else {
				System.out.println("vehicle with number "+ vehicle.vehicleNumber +" has been removed from " + parkingNumber);;
				mapperSmall.remove(vehicle);
				smallParkings[parkingNumber].isAssigned = false;
			}
		} else if(vehicle.size == Size.Car) {
			Integer parkingNumber = mapperCompact.get(vehicle);
			if(parkingNumber == null) {
				System.out.print("Vehicle is not present");
			} else {
				System.out.println("vehicle with number "+ vehicle.vehicleNumber +" has been removed from " + parkingNumber);;
				mapperCompact.remove(vehicle);
				compactParkings[parkingNumber].isAssigned = false;
			}
		} else if(vehicle.size == Size.Truck) {
			Integer parkingNumber = mapperLarge.get(vehicle);
			if(parkingNumber == null) {
				System.out.print("Vehicle is not present");
			} else {
				System.out.println("vehicle with number "+ vehicle.vehicleNumber +" has been removed from " + parkingNumber);;
				mapperLarge.remove(vehicle);
				largeParkings[parkingNumber].isAssigned = false;
			}
		}
	
		
	}
	

}
