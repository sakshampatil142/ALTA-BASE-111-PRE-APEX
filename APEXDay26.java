public class APEXDay26 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int readIndex = 2;
        System.out.println("Read: " + arr[readIndex]);

        int changeIndex = 0;
        arr[changeIndex] = 99;

        StringBuilder sb = new StringBuilder();
        sb.append("Updated array: ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}