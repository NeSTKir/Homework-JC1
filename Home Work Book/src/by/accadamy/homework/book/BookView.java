package by.accadamy.homework.book;

import java.util.List;

public class BookView {
	
	public static void printAuthor(List<Book> bb) {
		for (Book b : bb) {
			System.out.println("The auther is = " + b.getName());
		}
	}

	public static void printThepublishingHouse(List<Book> bb) {
		for (Book b : bb) {
			System.out.println("The Prodaction is = " + b.getName());
		}
	}

	public static void printTheYearOfPublished(List<Book> bb) {
		for (Book b : bb) {
			System.out.println("Year of publition = " + b.getName());
		}
	}

}
