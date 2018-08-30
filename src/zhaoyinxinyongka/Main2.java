package zhaoyinxinyongka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        System.out.println(process(list));
    }

    public static int process(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int size = list.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, list.get(i));
            max = Math.max(max, list.get(i) - min);
        }

        return max;
    }
}
