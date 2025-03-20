class Area {
    private int l; // Length
    private int b; // Breadth
    // Setter methods
    public void setLength(int l) {
        this.l = l;
    }
    public void setBreadth(int b) {
        this.b = b;
    }
    // Getter methods
    public int getLength() {
        return l;
    }
    public int getBreadth() {
        return b;
    }
    // Getter method to return area
    public int getArea() {
        return l * b;
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Area rect = new Area();
        rect.setLength(2);
        rect.setBreadth(16);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Breadth: " + rect.getBreadth());
        System.out.println("Area: " + rect.getArea());
    }
}