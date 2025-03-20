class MathTools {
    static int square(int x) { // Static method
        return x * x;
    }
    public static void main(String[] args) {
        int result = MathTools.square(5); // Calling static method without an object
        System.out.println("Square: " + result); // Output: Square: 25
    }
}