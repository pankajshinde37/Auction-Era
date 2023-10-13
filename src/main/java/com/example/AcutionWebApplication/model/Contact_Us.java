package com.example.AcutionWebApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Contact_Us {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fullName")
	private String fullName;
	
	
	@Column(name="email")
	private String email;
	

	@Column(name="phone")
	private String phone;
	
	




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	


	


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	@Override
	public String toString() {
		return "Contact_Us [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + "]";
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
