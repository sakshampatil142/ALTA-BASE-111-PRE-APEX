import java.util.*;
public class APEXDay4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();

        double afterDiscount = price - (price * 0.10);
        double finalPrice = afterDiscount + (afterDiscount * 0.18);

        System.out.println((int) finalPrice);
    }
}