package org.manyToMany.demo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vId;
	private String vName;
	@ManyToMany(mappedBy = "vehicle")
	private Collection<Employee> emp= new ArrayList();
	
	
	
//	public int getvId() {
//		return vId;
//	}
//	public void setvId(int vId) {
//		this.vId = vId;
//	}
	
	
	public String getvName() {
		return vName;
	}
	public Collection<Employee> getEmp() {
		return emp;
	}
	public void setEmp(Collection<Employee> emp) {
		this.emp = emp;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	
	
}
