import java.util.*;

public class APEXDay25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(arr[i]);
            if (i != 4) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}