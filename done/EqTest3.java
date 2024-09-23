public class EqTest3 {
    public static void main(String[] args) {
        EqTest e = new EqTest(); 
    }
}

class EqTest {
    public EqTest() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

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
