package by.htp.library.logic;

import java.util.Scanner;

import by.htp.library.ntety.Book;
import by.htp.library.ntety.Catalog;

public class Librian1 {
	
	private Book [] book;
	
	 Scanner sc = new Scanner(System.in);
	
	
	public void selectAuthor (Catalog catalog){
		System.out.print("������� ������ ������� ������:");
		String s = sc.nextLine();
		for(Book bk : catalog.getBooks()){
			if(bk.getAuthor().getSurname().equalsIgnoreCase(s)){
		System.out.println(bk.getTitle()+" "+ bk.getAuthor().getName()+" "+bk.getAuthor().getSurname()+" "
				+bk.getDate());
			}
			}//else { System.out.println("��� ������ ������");}
	}// end of method
	
	public void SelectBook (Catalog catalog){
		System.out.println("������� ������ ������� ���� �������� �����  ���� ���� �������:");
		String s = sc.nextLine();
		String n = sc.nextLine();
		int year= sc.nextInt();
		
		for(Book bk : catalog.getBooks()){
			if(bk.getAuthor().getSurname().equalsIgnoreCase(s)&&bk.getTitle().equalsIgnoreCase(n)&&bk.getDate()==year){
				System.out.println("���������:");
		System.out.println(bk.getTitle()+" "+ bk.getAuthor().getName()+" "+bk.getAuthor().getSurname()+" "
				+bk.getDate());
			}
	}
	}// end of method
	
	public void PrintCatalog(Catalog catalog){
		System.out.println("������� �������:");
		String n = "������";
		String s=sc.nextLine();
		if(s.equalsIgnoreCase(n)){
		for(Book bk : catalog.getBooks()){
			System.out.println(bk.getAuthor().getSurname()+" "+
		bk.getAuthor().getName()+" "+bk.getTitle());
		}}
	}// end of method
	
	public void InfoBook (Catalog catalog){
		System.out.println("������� �������� �����:");
		String s = sc.nextLine();
		for(Book bk : catalog.getBooks()){
			if(bk.getTitle().equalsIgnoreCase(s)){
				System.out.println("�����:"+bk.getAuthor().getSurname()+" "+bk.getAuthor().getName());
				System.out.println("���� �������:"+ bk.getDate());
				
			}
		}
		
	}
}//end of class