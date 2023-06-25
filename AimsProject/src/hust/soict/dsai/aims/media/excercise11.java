package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.NonPositiveException;

import java.util.Collections;

public class excercise11 {
	public static void main(String[] arg) throws NonPositiveException {
		List<Media> mediae = new ArrayList<Media>();
		DigitalVideoDisc dvd = new DigitalVideoDisc("the lion King","Animation","Roger Allers",87,19.95f);
		CompactDisc cd = new CompactDisc("alo 123");
		Book book = new Book("oOP");
		
		mediae.add(book);
		mediae.add(cd);
		mediae.add(dvd);
//		for (Media m : mediae)
//			System.out.println(m.getTitle());
//		Collections.sort(mediae , new MediaComparatorByTitleCost()) ;
//		
//		System.out.println("\n after \n");
		for (Media m : mediae)
			System.out.println(m.getTitle());

	}
}
