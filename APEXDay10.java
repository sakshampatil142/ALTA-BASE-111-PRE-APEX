import java.util.*;

public class APEXDay10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        boolean isValid = true;

        if (month < 1 || month > 12) {
            isValid = false;
        } else if (day < 1) {
            isValid = false;
        } else {
            int maxDays;

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
            } else if (month == 2) {
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeap) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
            } else {
                maxDays = 31;
            }

            if (day > maxDays) {
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }
    }
}

