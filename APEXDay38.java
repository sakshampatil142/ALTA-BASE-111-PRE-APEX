import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class APEXDay38 {

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);                    // set removes duplicates automatically
        }

        HashSet<Integer> result = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);              // set keeps each common element once
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }
        return ans;
    }

    static int[] readArray(Scanner sc, String label) {
        System.out.print("Enter size of " + label + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums1 = readArray(sc, "first array");
        int[] nums2 = readArray(sc, "second array");

        System.out.println("Intersection: " + Arrays.toString(intersection(nums1, nums2)));
        sc.close();
    }
}