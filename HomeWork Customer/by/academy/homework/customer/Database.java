package by.academy.homework.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Database {

	private List<Customer> Info;

	public Database() {
		Info = new ArrayList<Customer>();
	}

	public void add(Customer a) {
		Info.add(a);
	}

	public List<Customer> getInfo() {
		return Info;
	}

	public void setInfo(List<Customer> info) {
		Info = info;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Info);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Database other = (Database) obj;
		return Objects.equals(Info, other.Info);
	}

	public List<Customer> getInfo(int i) {
		// TODO Auto-generated method stub
		return Info;
	}

}
