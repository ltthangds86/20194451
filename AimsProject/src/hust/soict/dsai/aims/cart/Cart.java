package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Comparator;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
public class Cart {
	public static final int MAX_NUMS_ORDERED = 20;
	private float cost = 0.0f;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private static int qtyOrdered;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public int getSize() {
		return itemsOrdered.size();
	}
	public ArrayList<Media> getOrder(){
		return itemsOrdered;
	}
	public void addMedia(Media media) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("The media has been added");
			qtyOrdered ++;
		}
	}

	public void addMedia(Media...media) {
		if (qtyOrdered + media.length >= 21) {
			System.out.println("Exceeds the permitted limits");
		}
		else {
			for (int i = 0;i<media.length;i++) {
				System.out.println("The media has been added");
				itemsOrdered.add(media[i]);
				qtyOrdered ++;
				}
			}
		}

	public void  removeMedia(Media media) {
		boolean check = true;
		ArrayList<Media> copy = new ArrayList<Media>();
		if (qtyOrdered == 0) {
			System.out.println("No media in cart");
			return;
		}
		
		for (int i = 0; i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getID() == media.getID() && itemsOrdered.get(i).getTitle().equals(media.getTitle())) {
				System.out.println(media.getTitle());
				check = false;
				itemsOrdered.set(i,null);
				qtyOrdered -=1;
				for (int j = 0;j<itemsOrdered.size();j++) {
					if (itemsOrdered.get(j) != null) {
						copy.add(itemsOrdered.get(j));
					}
				}
				itemsOrdered = new ArrayList<Media>();
				for (int m = 0; m < copy.size();m++) {
					itemsOrdered.add(copy.get(m));
				}
				
				System.out.println("The media has been removed");
				break;
				}
			
			}
		
		if (check == true) {
			System.out.println("The media is not in cart");
		}
	}
	
	public float totalCost() {
		cost = 0;
		for (int i = 0; i<itemsOrdered.size();i++) {
			if (itemsOrdered.get(i) != null)
				cost += itemsOrdered.get(i).getCost();
		}
		return cost;
	}

	public void print() {
		int stt = 0;
		System.out.println("***********************CART***********************");
		for (int i = 0; i <itemsOrdered.size();i++ ) {
			if (itemsOrdered.get(i) != null) {
				stt++;
				System.out.print(stt+". ");
				System.out.println(itemsOrdered.get(i).toString());
			}
		}
		System.out.println("Total Cost: "+totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getID() == id) {
				check = true;
				System.out.println(itemsOrdered.get(i).toString());
				break;
			}
		}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
	public void search(String title) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if(itemsOrdered.get(i) != null) {
			if (itemsOrdered.get(i).search(title)) {
				check = true;
				System.out.println(itemsOrdered.get(i).toString());
				break;
			}
		}
	}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
	public void searchAndPlay(String inputTitle) {
		boolean check = false;
		for (Media item: itemsOrdered) {
			if (inputTitle.toLowerCase().equals(item.getTitle().toLowerCase())){
				check = true;
				if (item instanceof DigitalVideoDisc) {
					((DigitalVideoDisc) item).play();
				}
				else if (item instanceof CompactDisc) {
					((CompactDisc) item).play();
				}
				else System.out.println("Can't play book");
			}
		}
		if (check == false) {
			System.out.println("The enter Title DOES NOT MATCH any items in store");
		}
	}
}
