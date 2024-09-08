package cps2232_attendance15;

// in an interface all of the methods are abstract
interface Borrowable {
		public abstract void checkOut ();
		public abstract void returnItem();
		public abstract boolean isAvailable();
		
}

// moving on to the LibraryItem abstract class

abstract class LibraryItem implements Borrowable {
	// data fields 
	
	protected String title;
	protected String author;
	protected String ISBN;
	protected boolean available;
	
	// constructors 
	
	public LibraryItem() {}
	
	public LibraryItem( String title, String author, String ISBN, boolean available) {
		this.title = title;
		this.author=author;
		this.ISBN=ISBN;
		this.available=available;
	}
	
	public abstract String getDisplayText();
	
	@Override 
	
	public void checkOut() { 
		if (available) {
			available=false;
		}
		else {
			System.out.println(" Item is not available for checkout.");
			
		}
	}
	
	@Override 
	
	public void returnItem() {
		available=true;
		System.out.println("item returned to the library");
	}
	
	public boolean isAvailable () {
		return available;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle() {
		this.title=title;
	}
	
	public String getAuthor() { 
		return author;
	}
	public void setAuthor() {
		this.author=author;
	}
	
	@Override 
	public String toString() {
		return  " title=" + title + ", author=" + author + ",ISBN=" + ISBN + ", available=" + available;
	}
}

public class Book  extends LibraryItem{
	protected String genre;
	protected String introduction;
	
	public Book() {}
	public Book ( String title, String author, String ISBN, boolean available, String genre, String introduction) {
		super (title, author, ISBN, available);
		this.genre=genre;
		this.introduction=introduction;
	}
	@Override 
	public String getDisplayText() {
		return " title: " + title + ", Introduction:" + introduction;
	}
	
	@Override 
	public String toString() { 
		return super.toString() + " genre=" + genre;
	}
	

}


 
