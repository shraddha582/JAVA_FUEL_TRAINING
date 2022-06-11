package com.example.demomvc4;

import java.util.ArrayList;
//import java.util.Collection;

public class Student {
//private static final Collection<? extends String> Multiple = null;
private String firstname;
private String lastname;
private String email;
private String gender;
//private String plang;
ArrayList<String>plang = new ArrayList<String>();
ArrayList<String>os = new ArrayList<String>();
ArrayList<String>city = new ArrayList<String>();

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
/*public String getPlang() {
	return plang;
}
public void setPlang(String plang) {
	this.plang = plang;
}*/
public ArrayList<String>getPlang(){
	return plang;
}
public ArrayList<String> getOs() {
	return os;
}
public void setOs(ArrayList<String> os) {
	this.os = os;
}
public ArrayList<String> getCity() {
	return city;
}
public void setCity(ArrayList<String> city) {
	this.city = city;
}
}
