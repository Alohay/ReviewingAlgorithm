package zhaoyinxinyongka;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().trim().split(" ");
        int h = in.nextInt();
        System.out.println(process(arr, h));
    }

    public static int process(String[] arr, int h) {
        int size = arr.length;
        if (size > h) return -1;
        if (size == h) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                max = Math.max(max, Integer.parseInt(arr[i]));
            }
            return max;
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            double tmp = Math.round(Integer.parseInt(arr[i]) / sum * h);
            tmp = tmp < 1 ? 1 : tmp;
            h -= tmp;
            sum -= Integer.parseInt(arr[i]);
            max = Math.max(max, (int) Math.ceil(Integer.parseInt(arr[i]) / tmp));
        }
        return max;
    }

}
