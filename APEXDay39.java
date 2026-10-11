import java.util.ArrayList;
import java.util.Scanner;

public class APEXDay39 {

    static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            int smaller;
            if (a[i] < b[j]) {
                smaller = a[i++];
            } else if (a[i] > b[j]) {
                smaller = b[j++];
            } else {                       // equal: take it once, move both
                smaller = a[i];
                i++;
                j++;
            }
            addIfNew(result, smaller);
        }

        while (i < a.length) addIfNew(result, a[i++]);   // leftovers from a
        while (j < b.length) addIfNew(result, b[j++]);   // leftovers from b

        return result;
    }

    // skip a value if it equals the last one added (handles duplicates inside one array)
    static void addIfNew(ArrayList<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }

    static int[] readArray(Scanner sc, String label) {
        System.out.print("Enter size of " + label + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = readArray(sc, "first array");
        int[] b = readArray(sc, "second array");

        System.out.println("Union: " + union(a, b));
        sc.close();
    }
}