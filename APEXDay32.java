import java.util.Scanner;

public class APEXDay32 {

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        boolean found = false;

        for (int num : arr) {
            if (num > largest) {
                second = largest;     // old largest becomes second
                largest = num;
            } else if (num < largest && num > second) {
                second = num;         // strictly smaller, so it stays distinct
            }
        }

        // second only counts if it was actually updated by a distinct smaller value
        for (int num : arr) {
            if (num == second) { found = true; break; }
        }
        return (second == Integer.MIN_VALUE && !found) ? -1 : second;
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

        System.out.println("Second largest: " + secondLargest(arr));
        sc.close();
    }
}