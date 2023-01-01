package org.prince.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.thebest.prince.dto.Address;
import org.thebest.prince.dto.People;
import org.thebest.prince.dto.UserData;
import org.thebest.prince.dto.UserDetails;
import org.thebest.prince.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		Vehicle v= new Vehicle();
		v.setVehicleName("Harley davidson");
		
		People user= new People();
		user.setPeopleName("People one");
		user.setVehicle(v);
		
		
		
		SessionFactory sfj=new Configuration().configure().buildSessionFactory();
		Session session= sfj.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(v);
		session.getTransaction().commit();
		session.close();
		
		
		
		

	}

}
