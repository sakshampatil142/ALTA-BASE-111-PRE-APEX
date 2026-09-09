import java.util.*;

public class APEXDay8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}