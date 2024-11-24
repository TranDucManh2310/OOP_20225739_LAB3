package hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
private static int nbDigitalVideoDiscs = 0;
private int id;
private String title;
private String category;
private String director;
private int length;
private float cost;
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
public float getCost() {
	return cost;
}
public DigitalVideoDisc(String title) {
	super();
	this.title = title;
}
public DigitalVideoDisc(String title, String category, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.cost = cost;
}
public DigitalVideoDisc(String title, String category, String director, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.cost = cost;
}
public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.length = length;
	this.cost = cost;
	nbDigitalVideoDiscs++;
	this.id = nbDigitalVideoDiscs; // Gán id cho DVD mới
}
public void setTitle(String title) {
	this.title = title;
}

public int getId() {
return id;
}

// Getter cho số lượng DVD
public static int getNbDigitalVideoDiscs() {
return nbDigitalVideoDiscs;
}
public String toString() {
    return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
}
public boolean isMatch(String title) {
    return this.title != null && this.title.equalsIgnoreCase(title);
}

}
