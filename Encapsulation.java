class Programmer1 {
    private String name;
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Programmer1 p = new Programmer1();
        p.setName("Java");
        System.out.println("Name: " + p.getName());
    }
}