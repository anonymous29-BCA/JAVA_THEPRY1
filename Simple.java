public class Simple {
    int x;
    //Create a Class constructor for the simple class
    public Simple(){
        x=5;
    }
    public static  void main(String[]args){
        Simple myobj=new Simple();//Create an object(This will call the constructor)
        System.out.println(myobj.x);
    }
}