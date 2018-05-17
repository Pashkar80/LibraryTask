package by.htp.library.ntety;








public class Catalog {
	private Book [] books;
	private Author  authors;
	private int lastIndex;
	
public Book [] getBooks() {
		
		return books;
	}
	
	public Catalog() {
		this.books = new Book[5];

	}
	
public Author  getAuthors() {
		
		return authors;
	}
	
	public void Catalog1() {
		this.authors = new Author();

	}
	public Catalog(int size) {
		//super();
		this.books = new Book[size];
		
	}
	public void addBook(Book book){
		books [lastIndex]= book;
		lastIndex++;
		
	}
	

}
