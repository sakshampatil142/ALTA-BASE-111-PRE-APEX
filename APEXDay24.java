import java.util.*;

public class APEXDay24 {

    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static int largestOfThree(int a, int b, int c) {
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Sum of Two Numbers");
            System.out.println("2. Factorial");
            System.out.println("3. Prime Check");
            System.out.println("4. Largest of Three Numbers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum: " + sumOfTwo(a, b));
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Factorial: " + factorial(n));
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " is Prime");
                    } else {
                        System.out.println(num + " is Not Prime");
                    }
                    break;

                case 4:
                    System.out.print("Enter three numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = sc.nextInt();
                    System.out.println("Largest: " + largestOfThree(x, y, z));
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
