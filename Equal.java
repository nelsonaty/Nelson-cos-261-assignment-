public class EqualityExample {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a == b);         // false: compares references
        System.out.println(a.equals(b));    // true: compares content
    }
}
