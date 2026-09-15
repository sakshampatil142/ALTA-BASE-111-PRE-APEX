import java.util.*;

public class APEXDay14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int i = n;
        while (i >= 1) {
            sb.append(i);
            if (i != 1) {
                sb.append(" ");
            }
            i--;
        }

        System.out.println(sb.toString());
    }
}