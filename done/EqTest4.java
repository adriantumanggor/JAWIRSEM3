public class EqTest4 {
    public static void main(String[] args) {
        EqTest4 e = new EqTest4(); // Creating an instance of EqTest4
    }

    // Constructor for EqTest4
    public EqTest4() {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");

        // Using .equals() to compare the content of strings
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
