
public class Large extends ParkingSpot {
	
	Large(int parkingNumber) {
		
		this.parkingSpotNumber = parkingNumber;		
	
	}

	@Override
	public void setSize() {
		this.size = Size.Truck;
	}

}
