package lab3;

/**
 * Interface representing a game element in a hierarchical structure.
 * Each element must implement a method to calculate its area.
 */
public interface GameElement {
    /**
     * Calculates the area occupied by the game element.
     *
     * @return the area of the element in square units
     */
    int calculateArea();
}