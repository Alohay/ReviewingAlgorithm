package kuaishou;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        process(arr, n, m);
    }

    public static void process(int[] arr, int n, int m) {
        int size = arr.length;
        int[] help = new int[size];
        int[] lenarr = new int[size];
        help[0] = arr[0];
        int len = 1;
        for (int i = 1; i < size; i++) {
            if (help[i - 1] + arr[i] > arr[i]) {
                help[i] = help[i - 1] + arr[i];
                len++;
                lenarr[i] = len;
            } else {
                help[i] = arr[i];
                len = 1;
                lenarr[i] = len;
            }
        }
        int idx = 0;
        for (int i = 1; i < size; i++) {
            idx = help[i] > help[idx] ? i : idx;
        }




        int l = 0;
        int r = 0;
        int maxL = 0;
        int maxR = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (l <= r && r < size) {
            sum += arr[r];
            if (sum > max) {
                max = sum;
                maxL = l;
                maxR = r;
                r++;
            }
        }
    }
}
