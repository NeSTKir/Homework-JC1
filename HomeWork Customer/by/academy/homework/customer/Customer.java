package by.academy.homework.customer;

import java.util.Objects;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private long numberofcreditcard;
	private long numberofbankaccount;

	public Customer() {
		this.id = 0;
		this.surname = "";
		this.name = "";
		this.patronymic = "";
		this.numberofcreditcard = 0L;
		this.numberofbankaccount = 0L;
	}

	public Customer(int id, String surname, String name, String patronymic, long numberofcreditcard,
			long numberofbankaccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.numberofcreditcard = numberofcreditcard;
		this.numberofbankaccount = numberofbankaccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public long getNumberofcreditcard() {
		return numberofcreditcard;
	}

	public void setNumberofcreditcard(int numberofcreditcard) {
		this.numberofcreditcard = numberofcreditcard;
	}

	public long getNumberofbankaccount() {
		return numberofbankaccount;
	}

	public void setNumberofbankaccount(int numberofbankaccount) {
		this.numberofbankaccount = numberofbankaccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, numberofbankaccount, numberofcreditcard, patronymic, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id && Objects.equals(name, other.name) && numberofbankaccount == other.numberofbankaccount
				&& numberofcreditcard == other.numberofcreditcard && Objects.equals(patronymic, other.patronymic)
				&& Objects.equals(surname, other.surname);
	}

}
