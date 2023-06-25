package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.NonPositiveException;



public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book(String title, String category, float cost,List<String> authors) throws NonPositiveException {
		super(title, category, cost);
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
	}
	public void addAuthor(String authorName) {
		if (this.authors.contains(authorName) == false) this.authors.add(authorName);
		else System.out.println("author is already in list");
	}
	public void removeAuthor(String authorName) {
		if (this.authors.contains(authorName) == true) this.authors.remove(authorName);
		else System.out.println("not exists");
	}
	@Override
	public String toString() {
		return ("Book - "+super.getID()+" - "+super.getTitle() +" - "+super.getCategory() + " - "+ authors + " : " + super.getCost()+"$");
	}
}
