package Practice;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book firstBook = new Book();
		Book secondBook = new Book();
		Book thirdBook = new Book();

		firstBook.author = "J K Rowling";
		firstBook.title = "Harry Potter & Sorcerer's Stone";
		firstBook.pageCount = 350;

		secondBook.author = "Anne Frank";
		secondBook.title = "Diary Of Anne Frank";
		secondBook.pageCount = 300;

		thirdBook.author = "Charles Dickens";
		thirdBook.title = "Christmas Carols";
		thirdBook.pageCount = 200;
		
		System.out.println("Author of first book is "+firstBook.author);
		
		//System.out.println("title of the firstbook is "+firstBook.title);
		
		//firstBook.setTitle();
		//System.out.println("updated title of the first book is "+firstBook.title);
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter new title of the book");
		String newTitle= scanner.next();
		
		secondBook.setTitle(newTitle);
		
		System.out.println("new title for second book is : "+secondBook.title);
		scanner.close();
		}

}
