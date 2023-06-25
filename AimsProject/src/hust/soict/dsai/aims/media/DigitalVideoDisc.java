package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.NonPositiveException;
import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title) {
		super(title);
		
	}
	public DigitalVideoDisc(String title,String category, float cost) throws NonPositiveException {
		super(title,category,cost);

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) throws NonPositiveException {
		super(title,category,director,cost);


	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) throws NonPositiveException {
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
	
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		if( this.getLength() > 0) {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
//		return "Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength();
		}
		else {
			throw new PlayerException("ERROR: DVD's length of "+this.getTitle()+" is non-postive!");
		}
	}
		
}

