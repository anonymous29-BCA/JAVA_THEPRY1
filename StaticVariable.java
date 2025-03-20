class StaticVariable {
    static int count = 0;
    StaticVariable () {
        count++;
    }
    void displayCount() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable ();
        StaticVariable obj2 = new StaticVariable ();
        obj1.displayCount(); // Output: Count: 2
        obj2.displayCount(); // Output: Count: 2
    }
}