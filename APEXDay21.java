public class APEXDay21 {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int intResult = add(5, 10);
        double doubleResult = add(5.5, 10.2);

        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}

