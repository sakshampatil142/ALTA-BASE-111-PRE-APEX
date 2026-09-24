public class APEXDay22 {

    static void modifyInt(int x) {
        x = x + 100;
    }

    static void modifyArray(int[] arr) {
        arr[0] = arr[0] + 100;
    }

    public static void main(String[] args) {
        int a = 5;
        modifyInt(a);
        System.out.println("After modifyInt: " + a);

        int[] numbers = {5};
        modifyArray(numbers);
        System.out.println("After modifyArray: " + numbers[0]);
    }
}
