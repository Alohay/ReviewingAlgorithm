package weipinhui;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int size = n * n;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
