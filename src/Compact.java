
public class Compact extends ParkingSpot {
	
	Compact(int parkingNumber) {
		this.parkingSpotNumber = parkingNumber;
		
	}

	@Override
	public void setSize() {
		this.size = Size.Car;
	}

}
