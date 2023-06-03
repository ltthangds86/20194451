package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
	}
	public DigitalVideoDisc( String title,String category, float cost) {
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getID() {
		return id;
	}
	public void getDetail() {
		System.out.printf("DVD -  %s - %s - %s - %d: %f $\n",title,
				category,director,length,cost);
	}
	
	public boolean search(String title) {
        return this.title.contains(title);
    }
	
}

