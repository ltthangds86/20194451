package hust.soict.dsai.aims.media;

import java.util.Comparator;

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

	public Media( String title,String category, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		numberOfMedia+=1;
		this.id = numberOfMedia;
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
	public boolean equals(Object obj) {
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
