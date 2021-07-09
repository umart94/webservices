package model;

import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String firstname;
	public String lastname;
	public String emailid;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Customer(String firstname, String lastname, String emailid) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
	}
	public Customer() {
		this.firstname = "";
		this.lastname = "";
		this.emailid = "";
	}
	
	
	
}
