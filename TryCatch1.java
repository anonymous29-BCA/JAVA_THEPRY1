class TryCatch1 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
        System.out.println("I will always execute");
    }
}