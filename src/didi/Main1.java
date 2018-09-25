package didi;

import java.util.*;

public class Main1 {
    static final Set<Character> set1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'));
    static final Set<Character> set2 = new HashSet<>(Arrays.asList('y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'b', 'n', 'm'));

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
//        while (in.hasNext()) {
//            list.add(in.next());
//        }
        list = Arrays.asList("slep", "slap", "sleep", "step", "shoe", "shop", "snap");
        process(list);
    }

    public static void process(List<String> list) {
        String s = list.get(0);
        int size = list.size();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i < size; i++) {
            String tmp = list.get(i);
            map.put(tmp, compare(s.toCharArray(), tmp.toCharArray()));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String tmp = "";
            int cost = Integer.MAX_VALUE;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int val = entry.getValue();
                if (val < cost) {
                    cost = val;
                    tmp = entry.getKey();
                }
            }
            sb.append(tmp).append(" ");
            map.remove(tmp);
        }
        System.out.println(sb);
    }

    public static int compare(char[] s, char[] ss) {
        if (Arrays.equals(s, ss)) {
            return 0;
        }
        int size1 = s.length;
        int size2 = ss.length;
        if (size1 == size2) {
            for (int i = 0; i < size1; i++) {
                int r = c(s[i], ss[i]);
                if (r != 0) {
                    ss[i] = s[i];
                    return r + compare(s, ss);
                }
            }
        } else if (size1 < size2) {
            for (int i = 0; i < size1; i++) {
                int r = c(s[i], ss[i]);
                if (r != 0) {
                    char[] arr = new char[size2 - 1];
                    for (int j = 0; j < i; j++) {
                        arr[j] = ss[j];
                    }
                    for (int j = i + 1; j < size2; j++) {
                        arr[j - 1] = ss[j];
                    }
                    return 3 + compare(s, arr);
                }
            }
        } else {
            for (int i = 0; i < size2; i++) {
                int r = c(s[i], ss[i]);
                if (r != 0) {
                    char[] arr = Arrays.copyOf(ss, size1);
                    arr[i] = s[i];
                    for (int j = i; j < size2; j++) {
                        arr[j + 1] = ss[j];
                    }
                    return 3 + compare(s, arr);
                }
            }
        }
        return -1;
    }

    public static int c(char c1, char c2) {
        if (c1 == c2) {
            return 0;
        } else if ((set1.contains(c1) && set1.contains(c2))
                || (set2.contains(c1) && set2.contains(c2))) {
            return 1;
        } else {
            return 2;
        }
    }
}
