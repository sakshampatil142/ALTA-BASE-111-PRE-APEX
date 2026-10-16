import java.util.Scanner;

public class APEXDay43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;               // a letter that isn't a vowel
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
            // anything else (punctuation, symbols) is ignored
        }

        System.out.println("Vowels=" + vowels + " Consonants=" + consonants
                + " Digits=" + digits + " Spaces=" + spaces);
        sc.close();
    }
}
