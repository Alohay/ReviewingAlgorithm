package leetcode;

public class Code_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        int[] sa = new int[128];
        int[] ta = new int[128];
        int size = s.length();
        int size1 = t.length();
        if (size != size1) return false;

        for (int i = 0; i < size; i++) {
            sa[s.charAt(i)]++;
            ta[t.charAt(i)]++;
        }

        for (int i = 0; i < 128; i++) {
            if (sa[i] != ta[i]) return false;
        }
        return true;
    }
}
