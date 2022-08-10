
package by.academy.homework.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerLogic {

	public static List<Customer> listOfNumberOfCreditCard(List<Customer> cc, long number1, long number2) {

		List<Customer> result = new ArrayList<Customer>();

		for (Customer c : cc) {
			if (c.getNumberofcreditcard() > number1 && c.getNumberofcreditcard() < number2) {
				result.add(c);
			}
		}
		return result;
	}

	public List<Customer> listABC(List<Customer> cc) {

		for (int i = 0; i < cc.size() - 1; i++) {
			Customer min = cc.get(i);
			int index = i;

			for (int j = i + 1; j < cc.size(); j++) {
				if (min.getSurname().compareTo(cc.get(j).getSurname()) > 0) {
					min = cc.get(j);
					index = j;
				}
			}

			Customer temp = cc.get(i);
			cc.set(i, cc.get(index));
			cc.set(index, temp);

		}
		return cc;
	}

}
