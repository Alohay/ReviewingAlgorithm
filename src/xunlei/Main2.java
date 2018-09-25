package xunlei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        process(n);
    }

    public static void process(int n) {
        int c = 0;
        for (int i = 1; i * i <= n; i++) {
            for (int j = i + 1; j * i * 2 <= n; j += 2) {
                if (greatestYo(i, j) == 1 && i * i + j * j <= n)
                    c++;
            }
        }
        System.out.println(c);
    }

    public static int greatestYo(int k, int m) {
        int n = Math.max(k, m);
        k = Math.min(k, m);
        if (n % k == 0) {
            return k;
        }
        return greatestYo(k, n % k);
    }
}
