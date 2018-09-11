package jd;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            boolean[][] map = new boolean[n + 1][n + 1];
            for (int k = 0; k < m; k++) {
                int c = in.nextInt();
                int r = in.nextInt();
                map[Math.min(c, r)][Math.max(c, r)] = true;
//                map[r][c] = true;
            }
            process(map, n);
        }
    }

    public static void process(boolean[][] map, int n) {
        int[] group = new int[n + 1];
        int size = group.length;
        int cur = 0;
        int term = 1;
        boolean has = false;
        for (int i = 1; i < size; i++) {
            // ?
            if (group[i] == cur) {
                for (int j = i + 1; j < size; j++) {
                    if (group[j] < cur && map[i][j]) {
                        has = true;
                        group[j] = term;
                    }
                }
            }
            if (cur > term) break;
            if (i == size - 1) {
                if (has) term++;
                cur++;
                i = 1;
                has = false;
            }
        }
        for (int i = 1; i < size && term >= 0; i++) {
            // ?
            if (group[i] == term) {
                boolean has1 = false;
                for (int j = 1; j < size; j++) {
                    if (group[j] != group[i]) {
                        if (map[i][j]) {
                            has1 = true;
                            break;
                        }
                    }
                }
                if (!has1) {
                    System.out.println("No");
                    return;
                }
            }
            term--;
        }
        System.out.println("Yes");
    }
}
