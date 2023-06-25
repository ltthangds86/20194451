package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	static Scanner sc = new Scanner(System.in);
	static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store = new Store();
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		store.addMedia(dvd3);
		Book b = new Book("Boku no pico","anime",1000000,Collections.singletonList("Phu,Nguyen"));
		store.addMedia(b);
		CompactDisc cd = new CompactDisc("hihi", "kaka", "hoho", 123, "ko biet");
		store.addMedia(cd);
		implementCode(store,cart);
		
	}
	public static void implementCode(Store store,Cart cart) {
		showMenu();
		number = Integer.valueOf(sc.nextLine()); // check input
		if (number>3 || number < 0) {
			System.out.println("Invalid option");
			continueOrExist(store,cart);
		}
		
		switch (number) { // 4 option: 0,1,2,3
		case 1:
			storeMenu(); //check input
			int number1 = Integer.valueOf(sc.nextLine());
			if (number1>4 || number1 < 0) {
				System.out.println("Invalid option");
				continueOrExist(store,cart);
			}
			switch (number1) {//5 option: 0,1,2,3,4
			case 1:
				seeDetail(store,cart);
				break;
			case 2:
				store.seeStore();
				System.out.println("\nPlease enter Title: ");
				String inputTitle = sc.nextLine();
				boolean check = false;
				for (Media item:store.getItems()) {
					if (inputTitle.toLowerCase().equals(item.getTitle().toLowerCase())){
						check = true;
						cart.addMedia(item);
					}
				}
				if (check == false) {
					System.out.println("The enter Title DOES NOT MATCH any items in store");
				}
				System.out.println("The number of items in your cart: "+cart.getSize());
				
				break;
			case 3:
				store.seeStore();
				System.out.println("\nPlease enter Title: ");
				String inputTitle3 = sc.nextLine();
				check = false;
				for (Media item:store.getItems()) {
					if (inputTitle3.toLowerCase().equals(item.getTitle().toLowerCase())){
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
				break;
			case 4:
				cart.print();
				
				break;
			case 0:
				continueOrExist(store,cart);
				break;
			}
			continueOrExist(store,cart);
			break;
		case 2:
			updateStore();
			int number2 = Integer.valueOf(sc.nextLine());
			if (number2>2 || number2 < 0) {
				System.out.println("Invalid option");
				continueOrExist(store,cart);
			}
			
			switch (number2) { // 3 options: 0,1,2
			case 1:
				System.out.println("Add a media to the store");
				System.out.println("Enter the type of items");
				System.out.println("--------------------------------");
				System.out.println("1. DVD");
				System.out.println("2. CD");
				System.out.println("3. BOOK");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 1-2-3");
				int type = Integer.valueOf(sc.nextLine());
				
				if (type == 1) {
					System.out.print("\nEnter Title: ");
                    String title = sc.nextLine();
                     

                    System.out.print("\nEnter Category: ");
                    String category = sc.nextLine();
                     

                    System.out.print("\nEnter Cost: ");
                    Float cost = sc.nextFloat();
                    sc.nextLine();
                     

                    System.out.print("\nEnter Length: ");
                    int length =Integer.valueOf( sc.nextLine());
                     

                    System.out.print("\nEnter Director: ");
                    String director = sc.nextLine();
                     
                    DigitalVideoDisc item = new DigitalVideoDisc(title, category, director, length, cost);
                    store.addMedia(item);
				}
				else if (type == 2) {
					System.out.print("\nEnter Title: ");
                    String title = sc.nextLine();
                     

                    System.out.print("\nEnter Category: ");
                    String category = sc.nextLine();
                     

                    System.out.print("\nEnter Cost: ");
                    Float cost = sc.nextFloat();
                    sc.nextLine();

                    System.out.print("\nEnter Artist: ");
                    String artist = sc.nextLine();
                     

                    System.out.print("\nEnter Director: ");
                    String director = sc.nextLine();
                     
                    CompactDisc item = new CompactDisc(title, category, director, cost, artist);
                    store.addMedia(item);
				}
				else if (type == 3) {
					System.out.print("\nEnter Title: ");
                    String title = sc.nextLine();
                     

                    System.out.print("\nEnter Category: ");
                    String category = sc.nextLine();
                     

                    System.out.print("\nEnter Cost: ");
                    float cost = sc.nextFloat();
                    sc.nextLine();
                     

                    System.out.print("\nEnter number of authors: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    ArrayList<String> authors = new ArrayList<String>();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Name of Author " + i + ": ");
                        authors.add(sc.nextLine());

                    }
                    Book item = new Book(title,category, cost, authors);
                    store.addMedia(item);
				}
				else {
					System.out.println("Invalid option");
					continueOrExist(store,cart);
				}
				
				break;
			
			case 2:
				System.out.println("Remove a media to the store");
				store.seeStore();
				System.out.println("\nPlease enter Title of item that you want remove: ");
				String inputTitle = sc.nextLine();
				boolean c = false;
				for (Media item:store.getItems()) {
					if (inputTitle.toLowerCase().equals(item.getTitle().toLowerCase())){
						c = true;
						store.removeMedia(item);
					}
				}
				if (c == false) {
					System.out.println("The enter Title DOES NOT MATCH any items in store");
				}
				
				break;
			case 0:
				continueOrExist(store, cart);
				break;
			}
			continueOrExist(store,cart);
			break;
			
			
			
		
		case 3:
			cartMenu();
			int number3 = Integer.valueOf(sc.nextLine());
			if (number3>5 || number3 < 0) { 
				System.out.println("Invalid option");
				continueOrExist(store,cart);
			}
			
			switch (number3) {
			case 1:
				System.out.println("Filter medias in cart");
				System.out.println("--------------------------------");
				System.out.println("1. BY ID");
				System.out.println("2. BY TITLE");
				System.out.println("0. Exit");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2");
				int number4 = Integer.valueOf(sc.nextLine());
				
				if (number4 == 1) {
					System.out.println("\nPlease enter ID: ");
					int id = Integer.valueOf(sc.nextLine());
					cart.search(id);
				}
				else if(number4 == 2) {
					System.out.println("\nPlease enter Title: ");
					String inp = sc.nextLine();
					cart.search(inp);
				}
				else if (number4 == 0) {
					continueOrExist(store,cart);
				}
				else {
					System.out.println("Invalid option");
					continueOrExist(store,cart);
				}
				
				break;
				
			case 2:
				System.out.println("Sort medias in cart");
				 if (cart.getSize() > 0) {
                     System.out.println("Do you want to sort by?");
                     System.out.println("1. Title");
                     System.out.println("2. Cost");
                     System.out.println("0. Exit");
                     int number5 = Integer.valueOf(sc.nextLine());
                     if (number5 == 1) {
                    	 Collections.sort(cart.getOrder(),Cart.COMPARE_BY_TITLE_COST);
                    	 cart.print();
                     }
                     else if (number5 == 2) {
                    	 Collections.sort(cart.getOrder(),Cart.COMPARE_BY_COST_TITLE);
                    	 cart.print();
                     }
                     else if (number5 == 0) {
                    	 continueOrExist(store,cart);
                     }
                     else {
                    	 System.out.println("Invalid option");
                    	 continueOrExist(store,cart);
                     }
				 }
				 else {
					 System.out.println("You have not ordered any items yet!");
				 }
				 
				break;
			case 3:
				cart.print();
				System.out.println("\nPlease enter Title of item that you want remove from cart: ");
				String input = sc.nextLine();
				boolean c = false;
				for (Media item: cart.getOrder()) {
					if (input.toLowerCase().equals(item.getTitle().toLowerCase())){
						c = true;
						cart.removeMedia(item);
					}
				}
				if (c == false) {
					System.out.println("The enter Title DOES NOT MATCH any items in cart");
				}
				
				break;
			case 4:
				cart.print();
				System.out.println("\nPlease enter Title: ");
				String inputTitle = sc.nextLine();
				cart.searchAndPlay(inputTitle);
				
				break;
				
			case 5:
				System.out.println("PLACE ORDER");
				 if (cart.getSize() > 0) {
                     System.out.println("You need to pay " + cart.totalCost() + "$ to completed");
                     System.out.println("Do you want to continue? Yes/No");
                     System.out.println("Enter: Y or N");
                     String str = sc.nextLine();
                     if (str.toUpperCase().equals("Y")) {
                         System.out.println("Finished");
                         cart.getOrder().clear();
                         System.out.println("The cart is empty");
                         cart.print();
                     } 
                     else if (str.toUpperCase().equals("N")) {
                         System.out.println("Cancel the placing order");
                     }
                     else {
                    	 System.out.println("Invalid option");
                     }
                     break;
                 } 
				 else {
                     System.out.println("You have not ordered any items yet!");
                    
                 }
				 
				break;
			case 0:
				continueOrExist(store,cart);
				break;
			}
			continueOrExist(store,cart);
			break;
		case 0:
			System.out.println("Finished exit !!!");
			System.exit(0);
		
		}
		
		
		
	}
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		
		}
	
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a media to the store");
		System.out.println("2. Remove a media from the store");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		}
	
	
	public static void seeDetail(Store store, Cart cart) {
		for (Media i: store.getItems()) {
			System.out.println(i.toString());
			if (i instanceof DigitalVideoDisc || i instanceof CompactDisc) {
				System.out.println("Do you want to play? 1(Yes)/0(No) ");
				int answer =Integer.valueOf(sc.nextLine()) ;
				if (answer == 1) {
					if (i instanceof DigitalVideoDisc) ((DigitalVideoDisc) i).play();
					else ((CompactDisc) i).play();
				}
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println("Do you want to add any items to your current cart");
		System.out.println("--------------------------------");
		System.out.println("1. Yes");
		System.out.println("0. No");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
		int n = Integer.valueOf(sc.nextLine());
		if (n == 1) {
			System.out.println("Input ID of media: ");
			int id = Integer.valueOf(sc.nextLine());
			for (Media i: store.getItems()) {
				if (i.getID() == id) {
					cart.addMedia(i);
					break;
				}
			}
			System.out.println("After add: ");
			cart.print();
			continueOrExist(store,cart);
		}
		else if (n==0) {
			continueOrExist(store,cart);
		}
		else {
			System.out.println("invalid option");
			continueOrExist(store,cart);
		}
		
	}
	
	public static void continueOrExist(Store store, Cart cart) {
		System.out.println("\nDO YOU WANT TO CONTINUE ORDERING ? 1.Yes/0.No");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
		int aws = Integer.valueOf(sc.nextLine());
		if (aws == 0) {
			System.out.println("Finished exit !");
			System.exit(0);
		}
		else if (aws == 1) {
		implementCode(store,cart);
		}
		else {
			System.out.println("Invalid option");
			continueOrExist(store,cart);
		}
	}
}
