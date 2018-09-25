package baicizhan;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        process(n);
    }

    public static void process(int n) {
        if (n < 2) {
            System.out.println(false);
            return;
        }
        if (n == 2) {
            System.out.println(true);
            return;
        }
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                arr[j] = false;
            }
        }
        System.out.println(arr[n]);
    }
}
