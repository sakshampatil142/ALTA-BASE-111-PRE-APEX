import java.util.*;
public class APEXDay3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lightOn = scanner.nextBoolean();  // reads "true" or "false"

        System.out.println(lightOn ? "On" : "Off");

        lightOn = !lightOn;

        System.out.println(lightOn ? "On" : "Off");
    }
}