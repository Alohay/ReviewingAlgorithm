package iqiyi;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine(); // ?
        for (int i = 0; i < m; i++) {
            String s = in.nextLine();
            int idx = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
            if (s.startsWith("B")) {
                arr[idx - 1]--;
            } else {
                arr[idx - 1]++;
            }
        }
        int res = arr[p - 1];
        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > res) rank++;
        }
        System.out.println(rank + 1);
    }

}
