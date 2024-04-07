package com.example.OneToMany.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cart_id;
	private String cart_Serial_Number;
	
	@OneToMany(mappedBy="cart",cascade = CascadeType.ALL)
	private List<Item> item ;
	
	

	public Cart() {
		super();
	}



	public Cart(String cart_Serial_Number) {
		super();
		this.cart_Serial_Number = cart_Serial_Number;
		
	}



	public int getCart_id() {
		return cart_id;
	}



	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}



	public String getCart_Serial_Number() {
		return cart_Serial_Number;
	}



	public void setCart_Serial_Number(String cart_Serial_Number) {
		this.cart_Serial_Number = cart_Serial_Number;
	}



//	public List<Item> getItem() {
//		return item;
//	}
//
//
//
//	public void setItem(List<Item> item) {
//		this.item = item;
//	}



	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", cart_Serial_Number=" + cart_Serial_Number + ", item=" + item + "]";
	}
	
	
	

	
	
	
	

}
