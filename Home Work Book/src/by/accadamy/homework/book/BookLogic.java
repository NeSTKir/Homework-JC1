package by.accadamy.homework.book;

import java.util.List;
import java.util.ArrayList;

public class BookLogic {

	public List<Book> listTheAuthor(List<Book> bb, String author) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bb) {
			if (b.getAuthor() == author) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> listOfProdaction(List<Book> bb, String prodaction) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bb) {
			if (b.getProdaction() == prodaction) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> listDateOfProdaction(List<Book> bb, int date) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bb) {
			if (b.getDate() > date) {
				result.add(b);
			}
		}
		return result;
	}
}

