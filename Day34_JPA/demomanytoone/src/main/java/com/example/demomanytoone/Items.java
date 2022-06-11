package com.example.demomanytoone;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name = "Items")

public class Items {
	@Id
	int item_id;
	String item_desc;
	int item_cost;
	@ManytoOne
  @joinColumn(name="cart_id")
	private Cart Cartobj;
	public Items() {
		
	}
	public Items(int item_id, String item_desc,int item_cost) {
		this.item_id=item_id;
		item_desc=item_desc;
		item_cost= item_cost;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public int getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}
	public Cart getCartobj() {
		return Cartobj;
	}
	public void setCartobj(Cart cartobj) {
		Cartobj = cartobj;
	}
}
