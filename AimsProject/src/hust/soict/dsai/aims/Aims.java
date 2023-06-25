package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.NonPositiveException;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	static Scanner sc = new Scanner(System.in);
	static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store = new Store();
		Cart cart = new Cart();


//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
//		CompactDisc cd = new CompactDisc("hihi", "kaka", "hoho", 123, "ko biet");

	}
}
