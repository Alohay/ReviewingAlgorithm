package meituan;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] map = new boolean[n + 1][n + 1];
        for (int i = 1; i < n; i++) {
            map[in.nextInt()][in.nextInt()] = true;
        }
        int[] help = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (map[1][i + 1]) {
                help[i + 1] = 1 + process(map, n + 1, i + 1);
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            maxIndex = help[maxIndex] > help[i + 1] ? maxIndex : i + 1;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += help[i];
            res += i != maxIndex ? help[i] : 0;
        }
        System.out.println(res);
    }

    public static int process(boolean[][] map, int n, int curR) {
        int res = 0;
        for (int j = curR; j < n; j++) {
            if (map[curR][j]) {
                res += 1;
                res += process(map, n, j);
            }
        }
        return res;
    }


}
