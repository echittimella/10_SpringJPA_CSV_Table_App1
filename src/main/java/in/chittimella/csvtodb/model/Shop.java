package in.chittimella.csvtodb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shop {

	@Id
	@Column
	private int itemNumber;
	@Column
	private String itemName;
	@Column
	private double ItemPrice;

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	
	public Shop(int itemNumber, String itemName, double itemPrice) {
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.ItemPrice = itemPrice;
	}

	public Shop() {
		
	}

}
