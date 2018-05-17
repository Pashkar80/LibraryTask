package by.htp.library.logic;

import by.htp.library.ntety.Author;
import by.htp.library.ntety.Book;
import by.htp.library.ntety.Catalog;

public class Print {
	public Print(){
		
	}
	private Book [] book;
	private Book bk;
	public void PrintSelectAuthor(Catalog catalog){
		System.out.println(bk.getTitle()+" "+ bk.getAuthor().getName()+" "+bk.getAuthor().getSurname()+" "
				+bk.getDate());
		
	}

}
