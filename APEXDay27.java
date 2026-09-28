public class APEXDay27 {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        int num = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < 3; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                sb.append(grid[i][j]);
                if (j != 2) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
