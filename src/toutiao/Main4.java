package toutiao;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }


    public static void process(int[] arr, int t) {
        if (t < 0) return;
        int size = arr.length;
        int[] newArr = arr;
        if (t > 1) {
            newArr = new int[size * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            System.arraycopy(arr, 0, newArr, size - 1, size);
        }
        size = newArr.length;
        int len = 0;
        int count = 0;
        for (int i = 1; i < size; i++) {
            if (newArr[i] > newArr[i - 1]) {
                count++;
                len = Math.max(len, count);
            }
        }
        System.out.println(len);
    }
}
