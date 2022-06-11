package com.example.demomanytoone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name = "Cart")

public class Cart {
	@Id
private int cart_id;
private String uname;

@OneToMany(mappedBy = "Cartobj")
private Set<Item> items;

public Cart() {
	
	
}
public Cart(int Cart_id, String uname,Cart Cartobj) {
	super();
	this.cart_id = cart_id;
	this.uname = uname;
	this.Cartobj = Cartobj;
}
public int getCart_id() {
	return cart_id;
}
public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}



}
