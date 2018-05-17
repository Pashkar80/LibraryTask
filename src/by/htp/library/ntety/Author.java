package by.htp.library.ntety;





public class Author {
	private String name;
	 private String surname;
	 private int date;
	 private Author author;
	 private Author author1;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (date != other.date)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	 
	 public Author(){ 
	 }
	 public Author(String name,String surname,int date){ 
		 this.name=name;
		 this.surname=surname;
		 this.date=date;
	 }
	 public Author(Author author,Author author1){ 
		 this.author=author;
		 this.author1=author1;
	 }
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor1() {
		return author1;
	}

	public void setAuthor1(Author author1) {
		this.author1 = author1;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

	public int getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}
	 
	 

}
