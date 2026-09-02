import java.util.*;

public class APEXDay1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int daysLived = sc.nextInt();

        int years = daysLived / 365;
        int remainderDays = daysLived % 365;

        System.out.println(years + " years, " + remainderDays + " days");

        sc.close();
    }
}
