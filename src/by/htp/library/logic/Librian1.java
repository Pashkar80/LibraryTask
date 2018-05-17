package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.ntety.Book;
import by.htp.library.ntety.Catalog;

public class Librian1 {
	
	private Book [] book;
	
	 Scanner sc = new Scanner(System.in);
	
	
	public void selectAuthor (Catalog catalog){
		System.out.print("Введите данные фамилию автора:");
		String s = sc.nextLine();
		for(Book bk : catalog.getBooks()){
			if(bk.getAuthor().getSurname().equalsIgnoreCase(s)){
		System.out.println(bk.getTitle()+" "+ bk.getAuthor().getName()+" "+bk.getAuthor().getSurname()+" "
				+bk.getDate());
			}
			}//else { System.out.println("Нет такого автора");}
	}// end of method
	
	public void SelectBook (Catalog catalog){
		System.out.println("Введите данные фамилию ввод название книги  ввод дата издания:");
		String s = sc.nextLine();
		String n = sc.nextLine();
		int year= sc.nextInt();
		
		for(Book bk : catalog.getBooks()){
			if(bk.getAuthor().getSurname().equalsIgnoreCase(s)&&bk.getTitle().equalsIgnoreCase(n)&&bk.getDate()==year){
				System.out.println("Результат:");
		System.out.println(bk.getTitle()+" "+ bk.getAuthor().getName()+" "+bk.getAuthor().getSurname()+" "
				+bk.getDate());
			}
	}
	}// end of method
	
	public void PrintCatalog(Catalog catalog){
		System.out.println("Введите команду:");
		String n = "Печать";
		String s=sc.nextLine();
		if(s.equalsIgnoreCase(n)){
		for(Book bk : catalog.getBooks()){
			System.out.println(bk.getAuthor().getSurname()+" "+
		bk.getAuthor().getName()+" "+bk.getTitle());
		}}
	}// end of method
	
	public void InfoBook (Catalog catalog){
		System.out.println("Введите название книги:");
		String s = sc.nextLine();
		for(Book bk : catalog.getBooks()){
			if(bk.getTitle().equalsIgnoreCase(s)){
				System.out.println("Автор:"+bk.getAuthor().getSurname()+" "+bk.getAuthor().getName());
				System.out.println("Дата издания:"+ bk.getDate());
				
			}
		}
		
	}
}//end of class