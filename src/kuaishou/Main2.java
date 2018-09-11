package kuaishou;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(",");
        // TODO 问一下 那个 直接塞到 list里咋写的
        process(s);
    }

    public static void process(String[] arr) {
        int size = arr.length;
        if (size == 0) System.out.println("0");
        if (size == 1) System.out.println(arr[0]);
        if (size == 2) System.out.println(Math.min(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
        int[] help = new int[size];
        help[0] = Integer.parseInt(arr[0]);
        help[1] = Integer.parseInt(arr[1]);

        for (int i = 2; i < size; i++) {
            help[i] = Math.min(help[i - 1], help[i - 2]);
            help[i] += Integer.parseInt(arr[i]);
        }
        System.out.println(help[size - 1]);
    }
}
