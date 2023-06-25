package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.NonPositiveException;
import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable{

	@Override
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		if( this.getLength() > 0) {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
//		return "Playing Track: " + this.getTitle() +"\n" +"DVD length: " + this.getLength() +"\n";
		}
		else {
			throw new PlayerException("ERROR: Length of Track "+this.getTitle() +" is non-postive!");
		}
	}
	private String title;
	private int length;
	public Track(String title) {
		this.title = title;
	}
	public Track(String title, int l) throws NonPositiveException {
		this.title = title;
		if (l>0) {
		this.length = l;
		}else throw new NonPositiveException("Non-Positive length: Track "+this.getTitle());
	}
	public String getTitle(){
		return title;
	}
	public int getLength() {
		return length;
	}
	public boolean equals(Object obj) {
		if (obj == this ) {
			return true;
		}
		if (!(obj instanceof Track)){
			return false;
		}
		Track t = (Track) obj;
		return t.getTitle().equals(this.getTitle()) && t.getLength() == this.getLength();
	}
}
