package tujia;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(bigYo(n,m));
        System.out.println(smallBe(n,m));
    }


    public static int bigYo(int n, int m) {
        int nn = Math.max(n, m);
        m = Math.min(n, m);
        if (nn % m == 0) {
            return m;
        }
        return bigYo(m, nn % m);
    }

    public static int smallBe(int n, int m) {
        return n * m / bigYo(n, m);
    }

}
