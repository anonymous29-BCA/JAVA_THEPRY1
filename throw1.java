class throw1 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}