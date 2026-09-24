public class APEXDay23 {

    // Java has no built-in tuple/pair, so we use a small class to return two values
    static class DivisionResult {
        int quotient;
        int remainder;

        DivisionResult(int quotient, int remainder) {
            this.quotient = quotient;
            this.remainder = remainder;
        }
    }

    static DivisionResult divide(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        return new DivisionResult(quotient, remainder);
    }

    public static void main(String[] args) {
        DivisionResult result = divide(17, 5);
        System.out.println("Quotient: " + result.quotient);
        System.out.println("Remainder: " + result.remainder);
    }
}