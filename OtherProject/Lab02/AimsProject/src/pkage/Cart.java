package pkage;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private static int qtyOrdered;
	private static float cost = 0.0f;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("The cart is full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered >= 19) {
			System.out.println("Exceeding");
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered +=1;
			System.out.println("The disc has been added");
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered +=1;
			System.out.println("The disc has been added");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc...dvds) {
		if (qtyOrdered + dvds.length >= 21) {
			System.out.println("Exceeding");
		}
		else {
			for (int i = 0;i<dvds.length;i+=1) {
				System.out.println("The disc has been added");
				qtyOrdered +=1;
				itemsOrdered[qtyOrdered] = dvds[i];
				}
			}
		}
	
	
	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean kt = true;
		DigitalVideoDisc copy[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		if (qtyOrdered == 0) {
			System.out.println("The disc is out");
			return;
		}
		for (int i = 0; i<itemsOrdered.length;i+=1) {
			if (itemsOrdered[i] == disc) {
				kt = false;
				itemsOrdered[i] = null;
				qtyOrdered -=1;
				for (int j = 0,k=0;j<copy.length;j+=1) {
					if (itemsOrdered[j] != null) {
						copy[k+=1] = itemsOrdered[j];
					}
				}
				itemsOrdered = copy;
				System.out.println("The disc has been removed");
				break;
				}
			}
		if (kt == true) {
			System.out.println("The disc is not in cart");
		}
	}
	public float totalCost() {
		for (int i = 0; i<itemsOrdered.length;i+=1) {
			if (itemsOrdered[i] != null)
				cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	
	
	
}