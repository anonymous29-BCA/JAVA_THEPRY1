interface Animal3 {
    void makeSound();
}
class Dog3 implements Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
        myDog.makeSound();
    }
}