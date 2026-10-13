import java.util.Scanner;

public class APEXDay41 {

    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];      // swap the two ends
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();   // Strings can't be changed, chars can
        reverseString(chars);

        System.out.println("Reversed: " + new String(chars));
        sc.close();
    }
}