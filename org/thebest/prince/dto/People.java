package org.thebest.prince.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class People {

	@Id
	@GeneratedValue
	private int peopleId;
	private String PeopleName;
	@OneToOne
	@JoinColumn(name="VehicleId")
	private Vehicle vehicle;
	
	public String getPeopleName() {
		return PeopleName;
	}
	public void setPeopleName(String peopleName) {
		PeopleName = peopleName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
