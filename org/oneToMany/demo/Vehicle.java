package org.oneToMany.demo;

import javax.persistence.*;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vId;
	private String vName;
	@ManyToOne
	private Employee emp;
	
	
	
//	public int getvId() {
//		return vId;
//	}
//	public void setvId(int vId) {
//		this.vId = vId;
//	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	
	
}
