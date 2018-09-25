package xunlei;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        process(n, m);
    }

    public static void process(int n, int m) {
        int sum = m * 7;
        int c = 7;
        while (sum < 0) {
            sum += n;
            sum -= m;
            c--;
        }
        c++;
        sum -= n;
        sum += m;
        int zheng = 7 - c;
        int res = 0;
        if (zheng > 0 && zheng < 4) {
            res += zheng * n + (3 - zheng) * m;
        } else if (zheng >= 4) {
            res += 3 * n;
        } else {
            res += 3 * m;
        }
        System.out.println(sum + sum + res);
    }
}
