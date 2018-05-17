package by.htp.library.logic;

import java.util.Scanner;




import by.htp.library.ntety.Author;
import by.htp.library.ntety.Book;
import by.htp.library.ntety.Catalog;


public class Librian {
	String s ="Чехов";
	
	private Book [] book;
	private Book book1;
	public void selectAuthor(Catalog catalog){
		//int j=0;
		book=catalog.getBooks();
	     //Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		//System.out.println(s);
		for(Book book:catalog.getBooks()){
			
		if(s.equals(book.getAuthor().getSurname()));{
		System.out.println(book.getTitle());}
		
			 System.out.println(book.getDate()+" "+ book.getTitle());
		}
		
		//System.out.println(book1);
//		System.out.println(book[j].getTitle()+" "+
//		book[j].getAuthor().getSurname()+" "+
//				book[j].getAuthor().getName()+" "+
//		book1.getDate());
		
	
	
		
}
}//end of class