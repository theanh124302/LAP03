package LAB03;//HoangTheAnh20204938  

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers", 87, 24.95f);
		cart.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 19.95f);
		cart.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		cart.addDVD(dvd3);
		cart.showCart();
	}
}