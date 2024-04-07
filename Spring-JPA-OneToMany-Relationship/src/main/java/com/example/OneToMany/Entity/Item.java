package com.example.OneToMany.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Item_id;
	private String item_Name;
	private String item_Serial_Number;
	
	@ManyToOne()
	@JoinColumn(name = "cart_info")
	private Cart cart;

	public Item(String item_Name, String item_Serial_Number, Cart cart) {
		super();
		this.item_Name = item_Name;
		this.item_Serial_Number = item_Serial_Number;
		this.cart = cart;
	}

	public Item() {
		super();
	}

	public int getItem_id() {
		return Item_id;
	}

	public void setItem_id(int item_id) {
		Item_id = item_id;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public String getItem_Serial_Number() {
		return item_Serial_Number;
	}

	public void setItem_Serial_Number(String item_Serial_Number) {
		this.item_Serial_Number = item_Serial_Number;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Item [Item_id=" + Item_id + ", item_Name=" + item_Name + ", item_Serial_Number=" + item_Serial_Number
				+ ", cart=" + cart + "]";
	}
	
	
	
	
	

}
