package by.accadamy.homework.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {

	private List<Book> Books;

	public Group() {
		Books = new ArrayList<Book>();
	}

	public void add(Book b) {
		Books.add(b);
	}

	public List<Book> getBooks() {
		return Books;
	}

	public void setBooks(List<Book> books) {
		Books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(Books, other.Books);
	}

}
