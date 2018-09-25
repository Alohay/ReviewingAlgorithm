package qunaer;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        x1 -= 1;
        x2 -= 1;
        y1 -= 1;
        y2 -= 1;
        boolean[][] visited = new boolean[8][8];
        int[][] map = new int[8][8];
        System.out.println(process(x1, y1, x2, y2, visited, map, 0));
    }

    public static int process(int x1, int y1, int x2, int y2, boolean[][] visited, int[][] map, int step) {
        if (x1 < 0 || x2 < 0 || x1 > 7 || x2 > 7 || y1 < 0 || y1 > 7 || y2 < 0 || y2 > 7) {
            return Integer.MAX_VALUE;
        }

        if (visited[x1][y1]) {
            if (map[x1][y1] > step) {
                map[x1][y1] = step;
            } else {
                return Integer.MAX_VALUE;
            }
        } else {
            visited[x1][y1] = true;
            map[x1][y1] = step;
        }
        if (x1 == x2 && y1 == y2) {
            return map[x1][y1];
        }
        int r1 = process(x1 + 2, y1 + 1, x2, y2, visited, map, step + 1);
        int r2 = process(x1 + 2, y1 - 1, x2, y2, visited, map, step + 1);
        int r3 = process(x1 + 1, y1 + 2, x2, y2, visited, map, step + 1);
        int r4 = process(x1 + 1, y1 - 2, x2, y2, visited, map, step + 1);
        int r5 = process(x1 - 1, y1 + 2, x2, y2, visited, map, step + 1);
        int r6 = process(x1 - 1, y1 - 2, x2, y2, visited, map, step + 1);
        int r7 = process(x1 - 2, y1 + 1, x2, y2, visited, map, step + 1);
        int r8 = process(x1 - 2, y1 - 1, x2, y2, visited, map, step + 1);
        return min(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static int min(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        r1 = Math.min(r1, r2);
        r3 = Math.min(r3, r4);
        r4 = Math.min(r5, r6);
        r7 = Math.min(r7, r8);

        r1 = Math.min(r1, r3);
        r4 = Math.min(r4, r7);
        return Math.min(r1, r4);
    }

}
