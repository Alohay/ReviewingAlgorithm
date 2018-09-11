package yongyou;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        process(s);
    }

    public static void process(String[] s) {
        int l = 0;
        int r = 0;
        int idx = 0;
        int len = 0;
        int min = Integer.parseInt(s[0]);
        int max = Integer.parseInt(s[0]);
        int size = s.length;
        while (l <= r) {
            if (r - l == max - min) {
                if (r - l + 1 > len) {
                    len = r - l + 1;
                    idx = l;
                }
                r++;
                if (r == size) break;
                max = Math.max(Integer.parseInt(s[r]), max);
            } else {
                l++;
                if (l == size) break;
                min = Math.max(Integer.parseInt(s[l]), min);
            }
        }
        System.out.println("[" + s[idx] + ", " + len + "]");
    }
}
