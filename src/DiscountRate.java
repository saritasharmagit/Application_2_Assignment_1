// --------------------------------------------------------------------
// Assignment 1
// Written by: Sarita Sharma , Student ID:2195258
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------

import java.util.Date;

public class DiscountRate {
	// initialize the static variables
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;

	// make a static method for service discount using switch case and return the
	// double type value
	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			throw new IllegalArgumentException("wrong service type specified");
		}
	}

	// make a static method for product discount using switch case and return the
	// double type value
	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return productDiscountPremium;
		case "Gold":
			return productDiscountGold;
		case "Silver":
			return productDiscountSilver;
		default:
			throw new IllegalArgumentException("wrong service type specified");
		}
	}

}

//create a class for customer
 class Customer {
	// initialize the variables of customer
	private String name;
	private boolean member;
	private String memberType;

	// default constructor and initialize the member
	public Customer() {
		this.member = false;
	}

//parameterized constructor
	public Customer(String name, boolean member, String memberType) {
		this.name = name;
		this.member = member;
		this.memberType = memberType;
	}

//create the different getter and setter method
	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

//create tostring method it returns the customer information eg:name,member,member type
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", member=" + member + ", memberType='" + memberType + '\'' + '}';
	}
}

//create a class visit
class Visit {
	// initialize the variables of visit
	private Customer name;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	// create parameterized constructor
	public Visit(Customer name, Date date) {
		this.name = name;
		this.date = date;
	}

	// create different getter and setter methods
	public String getCustomerName() {
		return name.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

//create total expense method it returns the double type value
	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));

	}

	// create tostring method to print out the details of customer
	public String toString() {
		return "Visit{" + "customer name=" + name.getName() + ", customer member=" + name.isMember()
				+ ", customer member type=" + name.getMemberType() + ", date=" + date + ", serviceExpense="
				+ serviceExpense + ", productExpense=" + productExpense + '}';
	}
}
