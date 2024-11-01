package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class that represents a container for multiple game elements.
 * Implements the GameElement interface and can contain other GameElements,
 * allowing for a hierarchical structure.
 */
public class GameComposite implements GameElement {
    private List<GameElement> elements = new ArrayList<>();

    /**
     * Adds a game element to the composite.
     *
     * @param element the game element to add
     */
    public void addElement(GameElement element) {
        elements.add(element);
    }

    /**
     * Removes a game element from the composite.
     *
     * @param element the game element to remove
     */
    public void removeElement(GameElement element) {
        elements.remove(element);
    }

    /**
     * Calculates the total area of all elements within this composite.
     *
     * @return the combined area of all contained elements
     */
    @Override
    public int calculateArea() {
        int totalArea = 0;
        for (GameElement element : elements) {
            totalArea += element.calculateArea();
        }
        System.out.println("Calculating area of GameComposite: " + totalArea);
        return totalArea;
    }
}
