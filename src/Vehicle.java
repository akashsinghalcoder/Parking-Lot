
public abstract class Vehicle {
	int vehicleNumber;
	Size size;
	ParkingSpot parkingspot;
	
	public ParkingSpot getParkingspot() {
		return parkingspot;
	}

	public void setParkingspot(ParkingSpot parkingspot) {
		this.parkingspot = parkingspot;
	}

	
	public Size getSize() {
		return this.size;
	}
	
	public int getVehicleNumber() {
		return this.vehicleNumber;
	}
	
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}
