package tujia;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        process(arr, n, sum);
    }

    public static void process(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] += dp[i - 1][j];
                dp[i][j] += (arr[i] <= j ? dp[i - 1][j - arr[i]] : 0);
            }
        }
        System.out.println(dp[n - 1][sum]);
    }
}
