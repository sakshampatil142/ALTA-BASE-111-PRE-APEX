import java.util.Scanner;

public class APEXDay36 {

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;                    // extend the current streak
                max = Math.max(max, count);
            } else {
                count = 0;                  // a 0 breaks the streak
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Max consecutive ones: " + findMaxConsecutiveOnes(nums));
        sc.close();
    }
}