import java.util.Scanner;

public class APEXDay33 {

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {   // a drop means it's not non-decreasing
                return false;
            }
        }
        return true;                     // also true for empty or single-element arrays
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

        System.out.println("Is sorted: " + isSorted(arr));
        sc.close();
    }
}
