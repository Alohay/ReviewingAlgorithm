package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Code_290_WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, Integer> pmap = new HashMap<>();
        Map<String, Integer> smap = new HashMap<>();
        int psize = pattern.length();
        String[] arr = str.split(" ");
        int ssize = arr.length;
        if (psize != ssize) return false;
        for (int i = 0; i < psize; i++) {
            Integer pindex = pmap.put(pattern.charAt(i), i);
            Integer sindex = smap.put(arr[i], i);
            if (pindex != null && sindex == null) return false;
            if (pindex == null && sindex != null) return false;
            if (pindex != null && !pindex.equals(sindex)) return false;
        }
        return true;
    }
}
