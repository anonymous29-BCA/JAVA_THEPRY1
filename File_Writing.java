import java.io.FileWriter;
public class File_Writing {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Java Programming");
            fileWriter.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}