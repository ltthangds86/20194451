package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.exception.NonPositiveException;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Track;
import java.util.ArrayList;



public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title,String category,String director,float cost,String artist) throws NonPositiveException {
		super(title,category,director,cost);
		this.artist = artist;
	}
	public CompactDisc(String title,String category,String director,float cost,String artist,ArrayList<Track> tracks) throws NonPositiveException {
		super(title,category,director,cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	public void addTrack(Track t) {
		boolean check = true;
		for (int i = 0; i < tracks.size();i++) {
			if (t.getTitle().equals(tracks.get(i).getTitle())) {
				check = false;
				break;
			}
		}
		if (check =true) tracks.add(t);
		else System.out.println("already in");
	}
	
	public void removeTrack(Track t) {
		boolean check = true;
		for (int i = 0; i < tracks.size();i++) {
			if (t.getTitle().equals(tracks.get(i).getTitle())) {
				check = false;
				break;
			}
		}
		if (check =false) tracks.remove(t);
		else System.out.println("not exits");
	}
	
	public int getLength() {
		int sum = 0;
		for (int i = 0; i < tracks.size();i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
	}

	@Override

	public void play() throws PlayerException{
		if(this.getLength() > 0) {
		// TODO Play all tracks in the CD as you have implemented
		java.util.Iterator iter = tracks.iterator();
		Track nextTrack;
		while(iter.hasNext()) {
		nextTrack = (Track) iter.next();
		try {
		nextTrack.play();
		}catch(PlayerException e) {
			e.getError();
		}
		}
		}else {
		throw new PlayerException("ERROR: CD length is non-positive!");
		}
	}
	
	@Override
	public String toString() {
		return "CD - "+super.getID()+" - "+super.getTitle() +" - "+super.getCategory() + " - "+ artist + " - "+ super.getDirector()
		+" - "+ getLength()+ " : " + super.getCost() +"$";
	}
	
	public ArrayList<Track> getTracks(){
		return this.tracks;
	}
}
