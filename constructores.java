public class constructores {
    int x;
    // Create a class constructor for the simple class
    public constructores() {
        x = 5;
    }
    public static void main(String[] args) {
        constructores myObj = new constructores(); // Create an object (This will call the constructor)
        System.out.println(myObj.x);
    }
}
