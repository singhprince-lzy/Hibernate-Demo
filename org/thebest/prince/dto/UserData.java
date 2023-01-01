package org.thebest.prince.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="User_data")
public class UserData {
	
	/* collection demo:->
	 * @ElementCollection(name="nameoftable")
	 * 
	 * 
	 * 
	 * 
	 * */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="User_Address", 
				joinColumns = @JoinColumn(name="User_Id"))
//	@GenericGenerator(name="hilo-gen",strategy ="increment")
//	@CollectionId(columns = {@Column(name="AddressId")},generator = "hilo-gen",type = @Type(type = "long"))
	private Collection<Address> listOfaddress= new ArrayList<Address>();
	
	
	
	public Collection<Address> getListOfaddress() {
		return listOfaddress;
	}
	public void setListOfaddress(Collection<Address> listOfaddress) {
		this.listOfaddress = listOfaddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName;
	}
	
	
	
	
}
