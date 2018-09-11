package wangyi;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[2][n];

        for (int i = 0; i < n; i++) {
            arr[0][i] = in.nextInt();
            arr[1][i] = in.nextInt();
        }
        process(arr, n);
    }

    public static void process(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[0][i] == 1 || arr[0][i] == 2) {
                System.out.println("0 0");
                continue;
            }
            int res = (arr[0][i] & 1) == 0 ? arr[0][i] / 2 : (arr[0][i] + 1) / 2;
            int d = arr[1][i] - res;
            if (d <= 0) {
                System.out.println("0 " + arr[1][i]);
            } else {
                System.out.println("0 " + (res - d));
            }
        }
    }
}
