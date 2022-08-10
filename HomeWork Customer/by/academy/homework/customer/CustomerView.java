package by.academy.homework.customer;

import java.util.List;

public class CustomerView {
	
	public static void printNumberOfCreditCard(List<Customer> cc) {
		for (Customer c : cc) {
			System.out.println("The Number of Credit Card is = " + c.getName());
		}
	}
		
		public static void printABC(List<Customer> cc) {
			for (Customer c : cc) {
				System.out.println("List as ABC = " + c.getName());
			}
	}
}

