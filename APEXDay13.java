import java.util.*;

public class APEXDay13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (i != n) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
