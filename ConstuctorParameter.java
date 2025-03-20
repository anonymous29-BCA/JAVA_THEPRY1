public class ConstuctorParameter {
    int x;
    public ConstuctorParameter(int y) {
        x = y;
    }
    public static void main(String[] args) {
        ConstuctorParameter myObj = new ConstuctorParameter(5);
        System.out.println(myObj.x);
    }
}
