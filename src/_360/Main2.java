package _360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] see = new int[n];
        for (int i = 0; i < n; i++) {
            see[i] = in.nextInt();
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            process(see, in.nextInt() - 1, in.nextInt() - 1, m);
        }
    }

    public static void process(int[] a, int l, int r, int m) {
        int[] arr = new int[m];
        int count = 0;
        while (l < r) {
            if (arr[a[l] - 1] == 0) {
                count++;
            }
            arr[a[l++] - 1]++;
        }
        System.out.println(count);
    }
}
