package org.dteja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue
	String username;
	String password;
	String customerName;
	String mobileNo;
	String emailId;
	String role;
	String enabled;

}
