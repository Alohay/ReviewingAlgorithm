package kuaishou;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        process(n, m);
    }

    public static void process(int n, int m) {
        StringBuilder sb = new StringBuilder();
        int i = n / m;
        sb.append(i);
        n -= i * m;
        if (n == 0) {
            System.out.println(sb);
            return;
        }
        sb.append(".");
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int c = 1;
        int x = 10;
        int len = 1;
        while (n * x < m) {
            x *= 10;
            len++;
        }
        Integer back = map.put(n * x / m, c++);
        n = n * 10 % m;
        while (back == null && (n != 0 || c <= len)) {
            back = map.put(n * 10 / m, c++);
            n = n * 10 % m;
        }
        int k = 1;
        for (Integer value : map.keySet()) {
            if (n != 0 && k == back)
                sb.append("(");
            sb.append(value);
            k++;
        }
        if (n != 0)
            sb.append(")");
        System.out.println(sb);
    }
}
