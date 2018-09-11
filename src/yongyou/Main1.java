package yongyou;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split("\\s");
        process(s);
    }

    public static void process(String[] s) {
        Arrays.sort(s);
        int size = s.length;
        Set<String> set = new HashSet<>();
        boolean first = true;
        for (int i = 0; i < size; i++) {
            int len = s[i].length();
            String item = s[i].trim();
            if (item.isEmpty() || (len & 1) != 0) continue;
            if (len == 2) {
                set.add(item);
                if (!first) System.out.println();
                System.out.print(item);
                first = false;
            } else if (set.contains(item.substring(0, 2))) {
                int c = len / 2 - 1;
                System.out.println();
                while (c > 0) {
                    System.out.print("\t");
                    c--;
                }
                System.out.print(item);
                first = false;
            }
        }
    }
}

