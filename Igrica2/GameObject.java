// Danilo Vusurovic 25/026 FIST

package Igrica2;

public class GameObject {
    private int x;
    private int y;
    private int width;
    private int height;

    // Konstruktor
    public GameObject(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setteri
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Greska: sirina mora biti veca od nule.");
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Greska: visina mora biti veca od nule.");
        }
    }

    public boolean intersects(GameObject other) {
        return x < other.getX() + other.getWidth()
                && x + width > other.getX()
                && y < other.getY() + other.getHeight()
                && y + height > other.getY();
    }

    @Override
    public String toString() {
        return "GameObject @ (" + x + "," + y + ") " + width + "x" + height;
    }
}
