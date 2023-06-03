package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMS_ORDERED = 20;
	private static float cost = 0.0f;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMS_ORDERED];
	private static int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		if (qtyOrdered + dvdList.length >= 21) {
//			System.out.println("Exceeds the permitted limits");
//		}
//		else {
//			for (int i = 0;i<dvdList.length;i++) {
//				itemsOrdered[qtyOrdered] = dvdList[i];
//				qtyOrdered ++;
//			}
//		}
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered >= 19) {
			System.out.println("Exceeds the permitted limits");
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			System.out.println("The disc has been added");
			qtyOrdered ++;
			itemsOrdered[qtyOrdered] = dvd2;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
public void addDigitalVideoDisc(DigitalVideoDisc...dvds) {
	if (qtyOrdered + dvds.length >= 21) {
		System.out.println("Exceeds the permitted limits");
	}
	else {
		for (int i = 0;i<dvds.length;i++) {
			System.out.println("The disc has been added");
			itemsOrdered[qtyOrdered] = dvds[i];
			qtyOrdered ++;
			}
		}
	}

	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean check = true;
		DigitalVideoDisc copy[] = new DigitalVideoDisc[MAX_NUMS_ORDERED];
		if (qtyOrdered == 0) {
			System.out.println("No disc in cart");
			return;
		}
		for (int i = 0; i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] == disc) {
				check = false;
				itemsOrdered[i] = null;
				qtyOrdered -=1;
				for (int j = 0,k=0;j<copy.length;j++) {
					if (itemsOrdered[j] != null) {
						copy[k++] = itemsOrdered[j];
					}
				}
				itemsOrdered = copy;
				System.out.println("The disc has been removed");
				break;
				}
			}
		if (check == true) {
			System.out.println("The disc is not in cart");
		}
	}
	public float totalCost() {
		for (int i = 0; i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] != null)
				cost += itemsOrdered[i].getCost();
		}
		return cost;
	}

	public void print() {
		int stt = 0;
		System.out.println("***********************CART***********************");
		for (int i = 0; i <itemsOrdered.length;i++ ) {
			if (itemsOrdered[i] != null) {
				stt++;
				System.out.print(stt+". ");
				itemsOrdered[i].getDetail();
			}
		}
		System.out.println("Total Cost: "+totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.length;i++) {
			if (itemsOrdered[i].getID() == id) {
				check = true;
				itemsOrdered[i].getDetail();
				break;
			}
		}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
	public void search(String title) {
		boolean check = false;
		for (int i =0;i< itemsOrdered.length;i++) {
			if(itemsOrdered[i] != null) {
			if (itemsOrdered[i].search(title)) {
				check = true;
				itemsOrdered[i].getDetail();
				break;
			}
		}
	}
		if (check == false) {
			System.out.println("no match is found");
		}
	}
	
}
