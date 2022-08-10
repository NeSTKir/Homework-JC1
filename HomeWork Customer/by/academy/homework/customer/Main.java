package by.academy.homework.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database database = new Database();

		database.add(new Customer(1, "Petrov", "Piotr", "Petrov", 481111000012L, 442222000001L));
		database.add(new Customer(2, "Orlov", "Lev", "Petrov", 481111000014L, 442222000002L));
		database.add(new Customer(3, "Nestor", "Kirill", "Viktorovicz", 481111000015L, 442222000003L));
		database.add(new Customer(4, "Rusenko", "Oleg", "Szuszukin", 481111000016L, 442222000004L));
		database.add(new Customer(5, "Makarycz", "Grunvald", "Orszin", 481111000017L, 442222000005L));

		CustomerLogic logic = new CustomerLogic();
		List<Customer> result2 = logic.listOfNumberOfCreditCard(database.getInfo(), 481111000013L, 481111000017L);
		List<Customer> result1 = logic.listABC(database.getInfo());
		
		CustomerView Druken = new CustomerView();
		Druken.printNumberOfCreditCard(result2);
		Druken.printABC(result1);
	}

}
