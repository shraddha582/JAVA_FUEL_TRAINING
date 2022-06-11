package com.example.demoweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Users {
 public Users() 
 {
	 
}
//public Users(int id,String Username, String Password,String email) {
//	this.id = id;
//	this.Username=Username;
//	this.Password=Password;
//	this.email=email;
//}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String Username;
private String Password;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}