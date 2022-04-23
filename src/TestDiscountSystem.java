// --------------------------------------------------------------------
// Assignment 1
// Written by: Sarita Sharma , Student ID:2195258
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
//Q.2
import java.util.Date;

public class TestDiscountSystem {

	public static void main(String[] args) {

		System.out.println("Welcome to the Discount System!!!!!\n ***********************************");

		// create customer object and set the value
		Customer c1 = new Customer("Piet Clerx", true, "Premium");
		Customer c2 = new Customer("Trees Klaas", true, "Silver");
		//call and print the customer information 
		System.out.println(c1.toString());
		System.out.println(c2.toString());

		// create visit object ,call and print tostring() method
		Visit v1 = new Visit(c1, new Date());
		System.out.println(v1.toString());

		// set the value of product and service expenses
		v1.setProductExpense(4.5);
		v1.setServiceExpense(8.5);
		v1.setProductExpense(1.5);
		System.out.println(v1.toString());

		// call the method getToatalExpense and print the output with customer name
		System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

		System.out.println("***********************************\nThank you for using this service!");
	}

}