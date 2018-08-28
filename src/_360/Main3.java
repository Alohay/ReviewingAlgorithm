package _360;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int[] alen = new int[n];
        for (int k = 0; k < n; k++) {
            alen[k] = 1;
        }
        for (int k = 1; k < n; k++) {
            int r = k + 1;
            while (r < n) {
                if (a[r] < a[k]) {
                    r++;
                } else {
                    break;
                }
            }
            alen[k] = r - k + 1;
        }
        int[] blen = new int[n];
        for (int k = 0; k < n; k++) {
            blen[k] = 1;
        }
        for (int k = 0; k < n; k++) {
            int r = k + 1;
            while (r < n) {
                if (b[r] > b[k]) {
                    r++;
                } else {
                    break;
                }
            }
            blen[k] = r - k + 1;
        }
        int res = 0;
        for (int k = 0; k < n; k++) {
            res = Math.max(res, Math.min(alen[k], blen[k]));
        }
        System.out.println(res);
    }
}
