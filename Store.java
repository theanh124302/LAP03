package LAB03;//HoangTheAnh20204938  
import java.util.*;
public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
		System.out.println("Successfully added to store");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(dvd)) {
				itemsInStore.remove(i);
				System.out.println("Successfully removed from store");
			}
		}
	}
	
}