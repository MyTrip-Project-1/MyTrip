package com.g5.entities;


public class Bus {

	
	private int busId;
	private  String busType;
	private  String busNumber;
	private int capacity;
	private Travels travel;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int busId, String busType, String busNumber, int capacity, Travels travel) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.travel = travel;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Travels getTravel() {
		return travel;
	}
	public void setTravel(Travels travel) {
		this.travel = travel;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + busId;
		result = prime * result + ((busNumber == null) ? 0 : busNumber.hashCode());
		result = prime * result + ((busType == null) ? 0 : busType.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((travel == null) ? 0 : travel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (busId != other.busId)
			return false;
		if (busNumber == null) {
			if (other.busNumber != null)
				return false;
		} else if (!busNumber.equals(other.busNumber))
			return false;
		if (busType == null) {
			if (other.busType != null)
				return false;
		} else if (!busType.equals(other.busType))
			return false;
		if (capacity != other.capacity)
			return false;
		if (travel == null) {
			if (other.travel != null)
				return false;
		} else if (!travel.equals(other.travel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busType=" + busType + ", busNumber=" + busNumber + ", capacity=" + capacity
				+ ", travel=" + travel + "]";
	}
	
	
	
	
	
}