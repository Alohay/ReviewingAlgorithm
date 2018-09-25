package _4399;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = Arrays.asList(in.nextLine().split("\\s+"));
        for (Object o : list) {
            System.out.println(o);
        }
//        int n = in.nextInt();
//        int m = in.nextInt();
//        process(n, m);
    }


    public static void process(int n, int m) {
        boolean[] arr = new boolean[m + 1];

        for (int i = 0; i <= m; i++) {
            arr[i] = true;
        }

        for (int i = 2; i * i <= m; i++) {
            for (int j = 0; i * i + j <= m; j += i) {
                arr[i * i + j] = false;
            }
        }

        int count = 0;
        for (int i = n; i <= m; i++) {
            if (arr[i]) count++;
        }
        System.out.println(count);
    }
}
