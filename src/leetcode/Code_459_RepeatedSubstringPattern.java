package leetcode;

public class Code_459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        int len = s.length();
        int idx = ss.indexOf(s, 1);
        return idx != -1 && idx < len;
    }
}
