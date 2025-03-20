import java.io.*;
class Person implements Serializable {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SimpleExample {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 25);
// Serialize the object
            ObjectOutputStream out = new ObjectOutputStream(new
                    FileOutputStream("person.ser"));
            out.writeObject(person);
            out.close();
// Deserialize the object
            ObjectInputStream in = new ObjectInputStream(new
                    FileInputStream("person.ser"));
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            System.out.println("Name: " + deserializedPerson.name + ", Age: " +
                    deserializedPerson.age);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}