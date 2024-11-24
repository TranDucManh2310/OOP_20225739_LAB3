package Src;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display DVDs in the store
        System.out.println("After adding DVDs:");
        store.displayStore();

        // Remove a DVD from the store
        store.removeDVD("Star Wars");

        // Display DVDs in the store again
        System.out.println("\nAfter removing Star Wars:");
        store.displayStore();

        // Attempt to remove a DVD that does not exist
        store.removeDVD("Avatar");
    }
}
