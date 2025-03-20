class Animal2 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Dog2 D = new Dog2();
        D.makeSound();
        Cat C = new Cat();
        C.makeSound();
    }
}