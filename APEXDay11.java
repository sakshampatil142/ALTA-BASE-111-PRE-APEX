import java.util.*;

public class APEXDay11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean validOp = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                validOp = false;
        }

        if (validOp) {
            if (result == (long) result) {
                System.out.println((long) result);
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println("Invalid Operator");
        }
    }
}