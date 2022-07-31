package by.accadamy.homework.book;

import java.util.Objects;

public class Book {

	private int id;
	private String name;
	private String author;
	private String prodaction;
	private int date;
	private int number;
	private double price;
	private String material;

	public Book() {
		this.id = 0;
		this.name = "";
		this.author = "";
		this.prodaction = "";
		this.date = 0;
		this.number = 0;
		this.price = 0;
		this.material = "";
	}

	public Book(int id, String name, String author, String prodaction, int date, int number, double price, String material) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.prodaction = prodaction;
		this.date = date;
		this.number = number;
		this.price = price;
		this.material = material;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProdaction() {
		return prodaction;
	}

	public void setProdaction(String prodaction) {
		this.prodaction = prodaction;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, date, id, material, name, number, price, prodaction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && date == other.date && id == other.id
				&& Objects.equals(material, other.material) && Objects.equals(name, other.name)
				&& number == other.number && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(prodaction, other.prodaction);
	}

}
