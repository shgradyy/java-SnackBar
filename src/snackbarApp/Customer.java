package snackbarApp;

public class Customer {
	// fields
	private int maxid;
	private int id;
	private String name;
	private double cashOnHand;


	// methods
	

	// getters and setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}

	// add cash to cashOnHand here

	public double getCashOnHand(){
		return cashOnHand;
	}
	// buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

}