import java.util.Arrays;
import java.util.Scanner;

public class APEXDay35 {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;

        d = d % n;                    // d can be larger than n
        if (d == 0) return;

        reverse(arr, 0, d - 1);       // reverse first d elements
        reverse(arr, d, n - 1);       // reverse the remaining elements
        reverse(arr, 0, n - 1);       // reverse the whole array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        leftRotate(arr, d);

        System.out.println("Rotated array: " + Arrays.toString(arr));
        sc.close();
    }
}