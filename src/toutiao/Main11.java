package toutiao;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        process(s.toCharArray());
    }

    public static void process(char[] arr) {
        int size = arr.length;
        int[] help = new int[26];
        int l = 0;
        int r = 0;
        int len = 0;
        while (l <= r && r < size) {
            int idx = arr[r] - 97;
            if (help[idx] == 0) {
                help[idx]++;
                r++;
            } else {
                len = Math.max(len, r - l);
                help[arr[l++] - 97]--;
            }
        }
        len = Math.max(len, r - l);
        System.out.println(len);
    }
}
