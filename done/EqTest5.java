public class EqTest5 {
    public static void main(String[] args) {
        EqTest5 outer = new EqTest5();
        EqTest e = outer.new EqTest(); // Create an instance of the inner class
    }

    // Inner class EqTest
    class EqTest {
        // Constructor for EqTest
        public EqTest() {
            String s = "Java";
            String s2 = "java";
            
            if (s.equalsIgnoreCase(s2)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        }
    }
}
