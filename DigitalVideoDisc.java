//HoangTheAnh20204938
package LAB03;
public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String title;
	private String category;
	private String director;
	private int id;
	private int length;
	private double cost;
	DigitalVideoDisc(){
	}
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public double getCost() {
		return cost;
	}

	public DigitalVideoDisc(String title) {
		this.id = ++ nbDigitalVideoDiscs;
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, double cost) {
		this.id = ++ nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, double cost) {
		super();
		this.id = ++ nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		super();
		this.id = ++ nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public String printDvd() {
		return ("DVD - " + title + " ID: " + id + " - " + category + " - " + director + " - " + length +": " + cost + "$");
	}
	
}