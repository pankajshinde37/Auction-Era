package com.example.AcutionWebApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BidDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="price")
	private String price;
	
	@Column(name="item")
	private String item;
	
	
	@Column(name="email")
	private String email;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "BidDetails [id=" + id + ", price=" + price + ", iteam=" + item + ", email=" + email + "]";
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String iteam) {
		this.item = iteam;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	





	
	
}
