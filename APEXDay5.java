import java.util.*;

public class APEXDay5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();

        boolean isValidWithdrawal = amount > 0 && amount <= balance;

        System.out.println(isValidWithdrawal ? "True" : "False");
    }
}