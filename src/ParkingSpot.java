
public abstract class ParkingSpot {
	int parkingSpotNumber;
	Size size;
	Boolean isAssigned;
	
	public Boolean getIsAssigned() {
		return isAssigned;
	}
	public void setIsAssigned(Boolean isAssigned) {
		this.isAssigned = isAssigned;
	}
	ParkingSpot() {
		this.isAssigned = false;
		
	}
	public int getParkingSpotNumber() {
		return parkingSpotNumber;
	}
	
	public Size getSize() {
		return size;
	}
	public abstract void setSize();
	

}
