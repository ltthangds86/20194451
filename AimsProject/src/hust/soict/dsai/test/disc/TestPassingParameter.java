package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

class DVDswap {
	DigitalVideoDisc dvd;
	public DVDswap(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
}
public class TestPassingParameter {
	public static void swap(DVDswap o1,DVDswap o2) {
		DigitalVideoDisc tmp = o1.dvd;
		o1.dvd = o2.dvd;
		o2.dvd = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd,String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		DVDswap dvd1 = new DVDswap(jungleDVD);
		DVDswap dvd2 = new DVDswap(cinderellaDVD);
		swap(dvd1,dvd2);
		jungleDVD = dvd1.dvd;
		
		System.out.println("jungle dvd  title: "+jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle());
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+jungleDVD.getTitle());
	}
}

