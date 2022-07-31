package by.accadamy.homework.book;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();

		group.add(new Book(1, "Skazki", "Mickiewicz", "Omega", 1983, 100, 30, "Dub"));
		group.add(new Book(2, "Bayki", "Mickiewicz", "Omega", 1985, 150, 38, "Dub"));
		group.add(new Book(3, "Durak", "Dunin", "Alfa", 2000, 50, 57, "Zoloto"));
		group.add(new Book(4, "Ruch", "Mickiewicz", "Omega", 1999, 111, 88, "Dub"));
		
		BookLogic logic = new BookLogic();
		
		List<Book> result1 = logic.listTheAuthor(group.getBooks(), "Mickiewicz");
		List<Book> result2 = logic.listOfProdaction(group.getBooks(), "Alfa");
		List<Book> result3 = logic.listDateOfProdaction(group.getBooks(), 1998);
		
		BookView Druken = new BookView();
		
		Druken.printAuthor(result1);
		Druken.printThepublishingHouse(result2);
		Druken.printTheYearOfPublished(result3);
	
	}
}