import java.util.Scanner;

public class APEXDay42 {

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();                 // case-insensitive check

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;                // mismatch found, stop early
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Is palindrome: " + isPalindrome(str));
        sc.close();
    }
}