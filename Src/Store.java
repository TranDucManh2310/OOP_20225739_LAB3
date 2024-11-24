package Src;
import java.util.ArrayList;

public class Store {
    // Attribute: A list to hold DVDs in the store
    private ArrayList<DigitalVideoDisc> itemsInStore;

    // Constructor
    public Store() {
        this.itemsInStore = new ArrayList<>();
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("DVD added: " + dvd);
        } else {
            System.out.println("Cannot add a null DVD.");
        }
    }

    // Method to remove a DVD from the store by title
    public void removeDVD(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsInStore) {
            if (dvd.getTitle().equalsIgnoreCase(title)) {
                itemsInStore.remove(dvd);
                System.out.println("DVD removed: " + dvd);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("*************** STORE ***************");
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd);
            }
            System.out.println("*************************************");
        }
    }
}
