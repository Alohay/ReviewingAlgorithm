package tujia;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            process(in.nextInt(), in.nextInt());
        }
    }

    public static void process(int n, int k) {
        if (n % (k + 1) == 0) System.out.println("B");
        else System.out.println("A");
    }
}
