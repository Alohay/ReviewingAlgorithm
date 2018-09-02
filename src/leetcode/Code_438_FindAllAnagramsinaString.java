package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_438_FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        int size = s.length();
        int len = p.length();
        int l = 0;
        int r = 0;
        int[] a = new int[26];
        for (int i = 0; i < len; i++) {
            a[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int[] b = new int[26];
        while (l <= r && r <= size) {
            if (r < size && r - l < len) {
                b[s.charAt(r) - 'a']++;
                r++;
            } else if (r - l == len) {
                if (Arrays.equals(a, b)) {
                    res.add(l);
                }
                b[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return res;
    }
}
