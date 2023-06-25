package hust.soict.dsai.aims.cart;
import java.util.Comparator;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.media.MediaComparatorByTitleCost;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart {
	public static final int MAX_NUMS_ORDERED = 20;
	private float cost = 0.0f;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	private static int qtyOrdered;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public int getSize() {
		return itemsOrdered.size();
	}
	public ObservableList<Media> getOrder(){
		return itemsOrdered;
	}
	public void addMedia(Media media) throws LimitExceededException {
		if (qtyOrdered == 20) {
			throw new LimitExceededException("ERROR: The number of media has reached its limit");
//			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("The media has been added");
			qtyOrdered ++;
		}
	}

	public void addMedia(Media...media) throws LimitExceededException {
		if (qtyOrdered + media.length >= 21) {
//			System.out.println("Exceeds the permitted limits");
			throw new LimitExceededException("ERROR: The number of media has reached its limit");
		}
		else {
			for (int i = 0;i<media.length;i++) {
				System.out.println("The media has been added");
				itemsOrdered.add(media[i]);
				qtyOrdered ++;
				}
			}
		}

//	public void  removeMedia(Media media) {
//		boolean check = true;
//		ArrayList<Media> copy = new ArrayList<Media>();
//		if (qtyOrdered == 0) {
//			System.out.println("No media in cart");
//			return;
//		}
//		
//		for (int i = 0; i<itemsOrdered.size();i++) {
//			if (itemsOrdered.get(i).getID() == media.getID() && itemsOrdered.get(i).getTitle().equals(media.getTitle())) {
//				System.out.println(media.getTitle());
//				check = false;
//				itemsOrdered.set(i,null);
//				qtyOrdered -=1;
//				for (int j = 0;j<itemsOrdered.size();j++) {
//					if (itemsOrdered.get(j) != null) {
//						copy.add(itemsOrdered.get(j));
//					}
//				}
				

//				itemsOrdered = (ObservableList<Media>) copy;
//				System.out.println("The media has been removed");
//				break;
//				}
//			
//			}
//		
//		if (check == true) {
//			System.out.println("The media is not in cart");
//		}
//	}
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed");
        } else {
            System.out.println("The disc is not in Cart");
        }
    }
	
	public float totalCost() {
		float cost = 0;
        for (Media item : itemsOrdered) {
            cost += item.getCost();
        }
        return (float) (Math.ceil(cost*100)/100);
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
	
//	public void searchAndPlay(String inputTitle) {
//		boolean check = false;
//		for (Media item: itemsOrdered) {
//			if (inputTitle.toLowerCase().equals(item.getTitle().toLowerCase())){
//				check = true;
//				if (item instanceof Playable) {
//					try {
//						((Playable) item).play();
//					} catch (PlayerException e) {
//						// TODO Auto-generated catch block
////						e.printStackTrace();
//					}
//				}
//				else System.out.println("Can't play book");
//			}
//		}
//		if (check == false) {
//			System.out.println("The enter Title DOES NOT MATCH any items in store");
//		}
//	}
	public void clearCart() {
		itemsOrdered.clear();
	}
}
