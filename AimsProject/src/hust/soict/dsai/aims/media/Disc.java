package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.NonPositiveException;

public class Disc extends Media {
	private int length;
	private String director;
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category, float cost) throws NonPositiveException {
		super(title, category, cost);
	}
	public Disc(String title, String category, String director, float cost) throws NonPositiveException {
		super(title,category,cost);
	}
	public Disc(String title, String category, String director, int length, float cost) throws NonPositiveException {
		super(title,category,cost);
		this.director = director;
		if (length>0) {
		this.length = length;
		}
		else throw new NonPositiveException("Non-Positive length: "+super.getTitle());
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
}
