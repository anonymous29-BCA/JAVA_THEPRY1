abstract class Star {
    abstract void printInfo();
}
class Employee1 extends Star {
    void printInfo() {
        String name = "Avinash";
        int age = 21;
        float salary = 222.2F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Abstract {
    public static void main(String args[]) {
        Star s = new Employee1();
        s.printInfo();
    }
}
