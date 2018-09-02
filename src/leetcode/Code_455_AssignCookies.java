package leetcode;

import java.util.Arrays;

public class Code_455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sg = g.length;
        int ss = s.length;
        int min = Math.min(sg, ss);
        int res = 0;
        for (int i = 0; i < min; i++) {
            if (s[i] >= g[i]) res++;
        }
        int i = 0;
        int j = 0;
        int res1 = 0;
        while (i < sg && j < ss) {
            if (s[j] >= g[i]) {
                res1++;
                i++;
            }
            j++;
        }
        return Math.max(res, res1);
    }
}
