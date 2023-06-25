package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title) {
		super(title);
		
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super(title,category,cost);

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title,category,director,cost);


	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title,category,director,length,cost);

	}
	
	

	public String toString() {
		return ("DVD - "+super.getID()+" - "+ super.getTitle()+" - "+ super.getCategory() +" - "+ super.getDirector() 
		+" - "+ super.getLength()+" : "+ super.getCost()+"$");
	}
	public boolean search(String title) {
        return super.getTitle().contains(title);
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

