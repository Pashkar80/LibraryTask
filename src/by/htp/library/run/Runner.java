package by.htp.library.run;


import java.util.Scanner;

import by.htp.library.logic.Librian;
import by.htp.library.logic.Librian1;
import by.htp.library.logic.Print;
import by.htp.library.ntety.Author;
import by.htp.library.ntety.Book;
import by.htp.library.ntety.Catalog;



public class Runner {
	static String s;
	//static int year;
	public static void main(String[] args) {
		Author aut1= new Author("������","�����",1916);
		Author aut2= new Author("����������","�������",1915);
		Author aut3= new Author("������","��������",1886);
		Author aut4= new Author("�����","�����",1879);
		Author aut5= new Author("�����","��������",1978);
		//Author aut5= new Author(aut1,aut4);
		
		
		
		Book bk1 = new Book(aut1,"���� ���� ����",1946);
		Book bk2 = new Book(aut2,"����� � �������",1952);
		Book bk3 = new Book(aut3,"������ � ���������",1929);
		Book bk4 = new Book(aut4,"��������",1915);
		Book bk5 = new Book(aut5,"�������",2006);
		//Book bk5 = new Book(aut5,"�����",2016);
		
		
		Catalog catalog = new Catalog();
		catalog.addBook(bk1);
		catalog.addBook(bk2);
		catalog.addBook(bk3);
		catalog.addBook(bk4);
		catalog.addBook(bk5);
		//catalog.addBook(bk6);
		
	
		
		Librian1 select = new Librian1();
	   select.selectAuthor(catalog);
		select.SelectBook(catalog);
		select.PrintCatalog(catalog);
     //	select.InfoBook(catalog);
	   
	 //  Print print= new Print();
	//   print.PrintSelectAuthor(catalog);
	   
	   
		//Librian librian=new Librian();
	//librian.selectAuthor(catalog);
	
		//Print print1 = new Print();
		//print1.printSelectAuthor(s);
		
		
		

	}

}
