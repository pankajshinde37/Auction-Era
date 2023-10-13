package com.example.AcutionWebApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Auction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	
 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

@Column(name="winnerName")	
 private String winnerName;
 
 @Column(name="date")	
 private String date;
 
 
 @Column(name="amount")	
 private String amount;
 
 @Column(name="itemName")	
 private String itemName;

public String getWinnerName() {
	return winnerName;
}

public void setWinnerName(String winnerName) {
	this.winnerName = winnerName;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getAmount() {
	return amount;
}

public void setAmount(String amount) {
	this.amount = amount;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

@Override
public String toString() {
	return "Auction [winnerName=" + winnerName + ", date=" + date + ", amount=" + amount + ", itemName=" + itemName
			+ "]";
}
 
 
 
 
	
}
