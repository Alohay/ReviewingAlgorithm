package wanmeishijie;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] teamA = new int[n];
        int[] teamB = new int[n];
        for (int i = 0; i < n; i++) {
            teamA[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            teamB[i] = scanner.nextInt();
        }
        System.out.println(getMostBonus(n, teamA, teamB));
    }

    public static int getMostBonus(int n, int teamA[], int teamB[]) {
        Arrays.sort(teamA);
        Arrays.sort(teamB);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int d = teamA[i] - teamB[i];
            if (d > 0) {
                d = 1;
            } else if (d < 0) {
                d = -1;
            }
            max += d;
        }
        int i = 0;
        int j = 0;
        int t = 0;
        while (i < n) {
            if (teamA[i] > teamB[j]) {
                i++;
                j++;
                t++;
            } else {
                i++;
            }
        }
        return Math.max(max, 2 * t - n) * 100;
    }
}