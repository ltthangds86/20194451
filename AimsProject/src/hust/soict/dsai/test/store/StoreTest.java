package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("black clover");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("One piece","anime",1.8f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("alo 123","kobiet","kobiet",0.0f);
		store.addDVD(dvd1);
		store.addDVD(dvd2,dvd3);
		store.removeDVD(dvd3);
		store.removeDVD(dvd3);
	}

}
