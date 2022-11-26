package LAB03; //HoangTheAnh20204938  
class Change{
	DigitalVideoDisc changer;
	Change(DigitalVideoDisc changer){
		this.changer = changer;
	}
}
public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cindrellaDVD = new DigitalVideoDisc("Cindrella");
		//swap(jungleDVD, cindrellaDVD);
		System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("Cindrella dvd titile: " + cindrellaDVD.getTitle());
		//changeTitle(jungleDVD, cindrellaDVD.getTitle());
		//System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
		Change c1 = new Change(jungleDVD);
		Change c2 = new Change(cindrellaDVD);
		trueSwap(c1,c2);
		System.out.println("Jungle dvd title: " + c1.changer.getTitle());
		System.out.println("Cindrella dvd titile: " + c2.changer.getTitle());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void trueSwap(Change d1, Change d2) {
		DigitalVideoDisc dvd1 = d1.changer;
		d1.changer = d2.changer;
		d2.changer = dvd1;
	}
}
