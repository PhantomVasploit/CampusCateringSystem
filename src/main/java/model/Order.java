package model;


import java.io.Serializable;
import java.time.LocalDateTime;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private String foodItemName;
	private String amountOrdered;
	private String cost;
	private LocalDateTime dateAndTime = LocalDateTime.now();;
	
	// constructors
	public Order()
	{
		this.orderNumber = "";
		this.foodItemName = "";
		this.amountOrdered = "";
		this.cost = "";
		this.dateAndTime = null;
	}
	public Order(String foodItemName, String amountOrdered, String cost)
	{
		this.orderNumber = foodItemName.concat("-").concat(dateAndTime.toString());
		this.foodItemName = foodItemName;
		this.amountOrdered = amountOrdered;
		int totalCost = Integer.parseInt(cost) * Integer.parseInt(amountOrdered) ;
		this.cost = totalCost + "";
	}
	
	//setters
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	public void setFoodItem(String foodItemName)
	{
		this.foodItemName = foodItemName;
	}
	public void setCost(String cost)
	{
		this.cost = cost;
	}
	public void setAmountOrdered(String amountOrdered)
	{
		this.amountOrdered = amountOrdered;
	}
	public void setDateAndTime(LocalDateTime dateAndTime)
	{
		this.dateAndTime = dateAndTime;
	}
	
	// getters
	public String getOrderNumber()
	{
		return orderNumber;
	}
	public String getFoodItem()
	{
		return foodItemName;
	}
	public String getCost()
	{
		return cost;
	}
	public String getAmountOrdered()
	{
		return amountOrdered;
	}
	public LocalDateTime getDateAndTime()
	{
		return dateAndTime;
	}
}