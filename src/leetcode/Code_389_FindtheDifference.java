package leetcode;

public class Code_389_FindtheDifference {
    public char findTheDifference(String s, String t) {
        int[] sa = new int[26];
        for (char c : s.toCharArray()) {
            sa[c - 97]++;
        }
        for (char c : t.toCharArray()) {
            sa[c - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (sa[i] == -1) return (char) (i + 97);
        }
        return ' ';
    }
}
