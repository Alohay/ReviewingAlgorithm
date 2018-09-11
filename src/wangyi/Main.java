package wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(process(s.toCharArray(), 0, 0, 0, 21));
    }

    public static int process(char[] arr, int l, int ll, int count, int c) {
        int r = arr.length - 1;
        ll = l;
        while (l < r) {
            int d = arr[l] - arr[l + 1];
            if (count == 0 && d == 21) {
                count++;
            } else if (count == 0 && d == -21) {
                c = -21;
                count++;
            }
            if (d == c) {
                l += 2;
            } else {
                swap(arr, l, r--);
            }
        }
        if (l != 0 && l != ll && l < arr.length - 1) {
            l = process(arr, l, ll, count, c);
        }
        if (l == arr.length - 1) {
            int d = arr[l] - arr[l - 1];
            l = d == c ? l + 1 : l;
        }
        return Math.min(l, arr.length);
    }

    public static void swap(char[] arr, int p, int q) {
        char c = arr[p];
        arr[p] = arr[q];
        arr[q] = c;
    }
}
