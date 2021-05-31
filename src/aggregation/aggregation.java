package aggregation;

import java.util.Scanner;

// Driver class for the demonstration of aggregation.
public class aggregation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name of the author: ");
		String name = s.nextLine();
		System.out.println("enter the age of the author: ");
		int age = s.nextInt();
		s.nextLine();
		Author ath = new Author(name, age);
		System.out.println("enter the name of the book: ");
		String bookn = s.nextLine();
		System.out.println("enter the id of the book: ");
		int bookid = s.nextInt();
		Book book = new Book(bookn, bookid, ath);

		book.viewDetails();
		s.close();
	}
}
