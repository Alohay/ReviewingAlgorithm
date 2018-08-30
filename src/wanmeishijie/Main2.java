package wanmeishijie;

import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int y = reader.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        System.out.println(minHP(array));
    }
//
//    public static int minHP(int[][] m) {
//        int row = m.length;
//        int col = m[0].length;
//        int[][] dp = new int[row--][col--];
//
//        int min = m[row - 1][col - 1] > 0 ? m[row - 1][col - 1] : 1;
//        for ()
//    }

    public static int minHP(int[][] m) {
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 1;
        }
        int row = m.length;
        int col = m[0].length;
        int[][] dp = new int[row][col];
        row--;
        col--;
        dp[row][col] = m[row][col] > 0 ? 1 : 1 - m[row][col];
        for (int i = col - 1; i >= 0; i--) {
            dp[row][i] = Math.max(dp[row][i + 1] - m[row][i], 1);
        }
        int right, down;
        for (int i = row - 1; i >= 0; i--) {
            dp[i][col] = Math.max(dp[i + 1][col] - m[i][col], 1);
            for (int j = col - 1; j >= 0; j--) {
                right = Math.max(dp[i][j + 1] - m[i][j], 1);
                down = Math.max(dp[i + 1][j] - m[i][j], 1);
                dp[i][j] = Math.min(right, down);
            }
        }
        return dp[0][0];
    }
}
