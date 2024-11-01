package lab3;

/**
 * Leaf class that represents a basic game item with a specific width and height.
 * Implements the GameElement interface and calculates its own area.
 */
public class GameItem implements GameElement {
    private int width;
    private int height;

    /**
     * Constructs a GameItem with the specified width and height.
     *
     * @param width  the width of the game item
     * @param height the height of the game item
     */
    public GameItem(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of this game item.
     *
     * @return the area of the item in square units
     */
    @Override
    public int calculateArea() {
        int area = width * height;
        System.out.println("Area of GameItem: " + area);
        return area;
    }
}