package _360;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[2][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = in.nextInt();
            arr[1][i] = in.nextInt();
        }
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);
        int len = arr[0][n - 1] - arr[0][0];
        len = Math.max(arr[1][n - 1] - arr[1][0], len);
        System.out.println(Math.max(len * len, 1));
    }
}
