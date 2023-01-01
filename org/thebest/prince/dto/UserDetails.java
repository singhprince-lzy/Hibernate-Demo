package org.thebest.prince.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "USER_DETAIL")
public class UserDetails {
	/* @Column(name="col_name") for adding name to the field
	 * @Basic(fetch,optional): adding that field to persist at db and apply all the hibernate defaults.
	 * @Transient : mark that field to ignore that for persistent in the db
	 * 				you can also ignore by marking the field as static
	 * @Temporal(TemporalType.DATE)
	 * @GeneratedValue --> it mark primary key to auto update we don't have to set the value of the field
	 * 
	 * if you have to embed object in the table just use @Embeddable at object class and @Embedded at table object.
	 * 
	 * Attribute overridden and embedded keys----
	 * @AttributeOverriddes 
	 */
	@Id
	@GeneratedValue
	private int UserId;
	private String UserName;
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column = @Column(name="Home_Street_Name")),
		@AttributeOverride(name="city",column = @Column(name="Home_City_Name")),
		@AttributeOverride(name="state",column = @Column(name="Home_State_Name")),
		@AttributeOverride(name="pincode",column = @Column(name="Home_Pincode")),
	})
	private Address homeAddress;
	
	@Embedded
	private Address officeAddress;
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}
