package qunaer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        process(list);
    }

    public static void process(List<Integer> list) {
        int size = list.size();
        int[] help = new int[size];
        help[0] = list.get(0);
        for (int i = 1; i < size; i++) {
            int tmp = list.get(i);
            help[i] = Math.max(tmp, help[i - 1] + tmp);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, help[i]);
        }
        System.out.println(max);
    }
}
