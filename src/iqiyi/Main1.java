package iqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        process(s.toCharArray());
    }

    public static void process(char[] arr) {
        int[] left = new int[6];
//        int[] right = new int[3];
        for (int i = 0; i < 6; i++) {
            left[i] = '9' - arr[i];
        }
//        for (int i = 3; i < 6; i++) {
//            right[i - 3] = '9' - arr[i];
//        }
        Arrays.sort(left);
//        Arrays.sort(right);
        int ll = arr[0] + arr[1] + arr[2];
        int rr = arr[3] + arr[4] + arr[5];
        int d = Math.max(ll, rr) - Math.min(ll, rr);
        int res = 0;
        int dd = d;
        for (int i = 2; i >= 0 && d > 0; i--) {
            d -= left[i];
            res++;
        }
//        int res1 = 0;
//        for (int i = 2; i >= 0 && dd > 0; i--) {
//            dd -= right[i];
//            res1++;
//        }
        System.out.println(res);
//        if (d == 0) {
//            res = 0;
//        } else if (d <= 9) {
//            for (int i = 3; i >= 0 && d > 0; i--) {
//                d -= f ? left[i] : right[i];
//                res++;
//            }
////            res = 1;
//        } else if (d <= 18) {
//
//            res = 2;
//        } else {
//            res = 3;
//        }
//        System.out.println(res);
    }

    public static int count(char[] arr) {
        int c = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] == '0') c++;
        }
        return c;
    }
}
