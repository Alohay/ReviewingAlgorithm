package meituan;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int t = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        process(arr, n, k, t);
    }

    public static void process(int[] arr, int n, int k, int t) {
        int res = 0;
        int l = 0;
        int r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r - l < k && r < n) {
            map.put(arr[r], map.getOrDefault(arr[r++], 0) + 1);
        }

        while (r <= n || k >= n) {
            for (Integer v : map.values()) {
                if (v >= t) {
                    res++;
                    break;
                }
            }
            if (k >= n || r == n) break;
            map.put(arr[l], map.get(arr[l++]) - 1);
            map.put(arr[r], map.getOrDefault(arr[r++], 0) + 1);
        }
        System.out.println(res);
    }
}
