package baicizhan;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(process(arr, 0, 0, k, 0));
    }

    public static boolean process(int[] arr, int cur, int sum, int k, int c) {
        if (sum == k && c > 0) {
            return true;
        }
        if (cur == arr.length) {
            return false;
        }
        return process(arr, cur + 1, sum + arr[cur], k, c + 1) || process(arr, cur + 1, sum, k, c);
    }
}
