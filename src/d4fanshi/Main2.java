package d4fanshi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        process(s1.toCharArray());
    }

    public static void process(char[] ca) {
        String ms = pre(ca);
        char[] ss = ms.toCharArray();
        int size = ss.length;
        int c = -1;
        int r = -1;
        int[] arr = new int[size];
        int idx = 0;
        int len = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            arr[i] = i < r ? Math.min(r - i, arr[2 * c - i]) : 1;
            while (i + arr[i] < size && i - arr[i] > -1
                    && ss[i + arr[i]] == ss[i - arr[i]]) {
                arr[i]++;
            }
            if (i + arr[i] > r) {
                c = i;
                r = i + arr[i];
            }
            if (len < arr[i]) {
                len = arr[i];
                idx = i;
            }
            if (r == size) {
                break;
            }
        }
        int k = idx - len + 1;
        for (int i = k; i < (idx + len); i++) {
            if (ss[i] == '#') continue;
            System.out.print(ss[i]);
        }
    }

    public static String pre(char[] arr) {
        StringBuilder sb = new StringBuilder("#");
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append('#');
        }
        return sb.toString();
    }
}
