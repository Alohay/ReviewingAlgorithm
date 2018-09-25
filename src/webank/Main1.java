package webank;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        process(n);
    }

    public static void process(int n) {
        int c = 1;
        for (int i = 1; i < n; i++) {
            n -= i;
            c++;
            if (n < 0) {
                n += i - 1;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if ((c & 1) == 0) {
            sb.append(n).append("/").append(c - n + 1);
        } else {
            sb.append(c - n + 1).append("/").append(n);
        }
        System.out.println(sb);
    }

}
