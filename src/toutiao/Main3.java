package toutiao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            in.nextLine();
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(in.nextLine());
            }
            process(list);
        }
    }

    public static void process(List<String> list) {
        int n = list.size();
        if (n < 1) System.out.println("Sad");
        list.sort(Comparator.comparingInt(String::length));
        for (int i = 0; i < n; i++) {
            StringBuilder ss = new StringBuilder(list.get(i));
            int size = ss.length();
            ss.append(ss);
            String s2 = ss.toString();
            String s1 = ss.reverse().toString();
            for (int j = i + 1; j < n; j++) {
                String s3 = list.get(j);
                int len = s3.length();
                if (len == size
                        && (s1.contains(s3) || s2.contains(s3))) {
                    System.out.println("Yeah");
                    return;
                }
                if (len != size) {
                    size = len;
                }
            }
        }
        System.out.println("Sad");
    }
}


