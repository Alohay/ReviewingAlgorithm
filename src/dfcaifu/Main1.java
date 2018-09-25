package dfcaifu;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        process(arr);
    }

    public static void process(int[] arr) {
        Arrays.sort(arr);
        int r = arr.length - 1;
        int l = 0;
        int left = arr[0];
        int right = arr[r];
        while (l != r - 1) {
            if (left < right) {
                left += arr[++l];
            } else {
                right += arr[--r];
            }
        }
        System.out.println(right == left);
    }
}
