//HoangTheAnh20204938
package LAB03;
import java.util.ArrayList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered;
	public Cart() {
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void getQtyOrdered(int a) {
		qtyOrdered = a;
	}
	public void addDVD(DigitalVideoDisc disc) {
		if (itemsOrdered.size() < 20) {
			itemsOrdered.add(disc);
			System.out.println("The disc has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDVD(DigitalVideoDisc [] dvdList) {
		if ((dvdList.length + itemsOrdered.size()) <= MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < dvdList.length; i++) {
				itemsOrdered.add(dvdList[i]);
			}
			System.out.println("The list of discs has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (itemsOrdered.size() + 2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(dvd1);
			itemsOrdered.add(dvd2);
			System.out.println("The discs has been added");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void removeDVD(DigitalVideoDisc disc) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if ((itemsOrdered.get(i)).equals(disc))
				itemsOrdered.remove(i);
		}
		System.out.println("The disc has been successfully removed");
	}
	public double totalCost() {
		double a = 0d;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			a += (itemsOrdered.get(i)).getCost();
		}
		return a;
	}
	public void displayCart() {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println((itemsOrdered.get(i)).getTitle());
		}
	}
	int dem = 1;
	public void showCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i <= itemsOrdered.size(); i++) {
			System.out.println(i + ". " + itemsOrdered.get(i).printDvd());
		}
		System.out.println("***************************************************");
	}
	
}