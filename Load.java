public class OverloadExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        System.out.println("Sum (int): " + obj.add(5, 3));
        System.out.println("Sum (double): " + obj.add(2.5, 3.1));
    }
}
