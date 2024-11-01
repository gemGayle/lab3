package lab3;

/**
 * Main class to demonstrate the Composite Design Pattern.
 * Creates a hierarchy of game elements and calculates their total area.
 */
public class Main {
    /**
     * The main method to run the demonstration of the Composite pattern.
     * Creates individual game items, groups them into composites, and calculates the total area.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create basic elements (leaf nodes) with fixed sizes
        GameItem item1 = new GameItem(5, 10); // Area = 5 * 10 = 50
        GameItem item2 = new GameItem(3, 4);  // Area = 3 * 4 = 12
        GameItem item3 = new GameItem(7, 6);  // Area = 7 * 6 = 42

        // Create a composite (container element) and add basic elements to it
        GameComposite composite1 = new GameComposite();
        composite1.addElement(item1);
        composite1.addElement(item2);

        // Create another composite that includes the first composite and another element
        GameComposite composite2 = new GameComposite();
        composite2.addElement(composite1);
        composite2.addElement(item3);

        // Calculate and print the total area of composite2, which includes all elements
        System.out.println("Total area of composite2: " + composite2.calculateArea());
    }
}