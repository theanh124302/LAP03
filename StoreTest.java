package LAB03;//HoangTheAnh20204938  
public class StoreTest {

	public static void main(String[] args) {
		Store st1 = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 24.95f);
		st1.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 19.95f);
		st1.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		st1.addDVD(dvd3);
		
		st1.removeDVD(dvd3);
	}

}