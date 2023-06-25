package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.exception.NonPositiveException;

public class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private String date;
	public static int numberOfMedia = 0;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	
	public Media(String title) {
		this.title = title;
		numberOfMedia+=1;
		this.id = numberOfMedia;
	}

	public Media( String title,String category, float cost) throws NonPositiveException {
		this.category = category;
		this.title = title;
		numberOfMedia+=1;
		this.id = numberOfMedia;
		if (cost>0) {
			this.cost = cost;
		}
		else throw new NonPositiveException("Non-Positive cost: "+this.getTitle());
	}
	
	public int getID() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "media";
	}

	public boolean search(String title) {
        return this.title.contains(title);
    }
	@Override
	public boolean equals(Object obj) { //ex15 lab05
		if (obj == null) {
			return false;
		}
		if (obj == this ) {
			return true;
		}
		if (!(obj instanceof Media)){
			return false;
		}
		Media m = (Media) obj;
		return m.getTitle().equals(this.getTitle());
	}
}
