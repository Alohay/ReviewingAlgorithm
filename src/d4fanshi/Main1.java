package d4fanshi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        process(s[0], s[1]);
    }

    public static void process(String s1, String s2) {
        int size1 = s1.length();
        int size2 = s2.length();
        int[] arr = new int[size1 + size2];
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();

        for (int i = 0; i < size1; i++) {
            int n = s1.charAt(i) - '0';
            for (int j = 0; j < size2; j++) {
                arr[i + j] += n * (s2.charAt(j) - '0');
            }
        }

        int size = arr.length;
        int c = 0;
        for (int i = 0; i < size; i++) {
            int t = (arr[i] + c) % 10;
            c = (arr[i] + c) / 10;
            arr[i] = t;
        }
        int end = size - 1;
        while (end > 0) {
            if (arr[end] != 0) break;
            end--;
        }
        System.out.print(c == 0 ? "" : c);
        for (int i = end; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }

}
