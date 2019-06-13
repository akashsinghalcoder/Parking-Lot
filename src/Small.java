
public  class Small extends ParkingSpot {
	
	Small(int parkingNumber) {
		
			this.parkingSpotNumber = parkingNumber;		
		
	}

	@Override
	public void setSize() {
		this.size = Size.Bike;

	}

}
