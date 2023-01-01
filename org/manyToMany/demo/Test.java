package org.manyToMany.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		
		Vehicle v= new Vehicle();
		v.setvName("Harley davidson");
		
		Vehicle v1= new Vehicle();
		v1.setvName("Jeep Compass");
		
		Employee user= new Employee();
		user.setEmployeeName("Employee one");
		
		user.getVehicle().add(v1);
		user.getVehicle().add(v);
		
		v.getEmp().add(user);
		v1.getEmp().add(user);
		
		
		
		SessionFactory sfj=new Configuration().configure().buildSessionFactory();
		Session session= sfj.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(v);
		session.save(v1);
		session.getTransaction().commit();
		session.close();
		
	}

}
