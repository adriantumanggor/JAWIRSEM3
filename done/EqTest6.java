public class EqTest6 {
    public static void main(String[] args) {
        String str = "Java";

        StringBuffer buffer = new StringBuffer(str);
        
        if (str.equals(buffer.toString())) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
