package leetcode;

public class Code_383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        int s2 = magazine.length();
        char[] ma = magazine.toCharArray();
        for (int i = 0; i < s2; i++) {
            a[ma[i] - 97]++;
        }
        int s1 = ransomNote.length();
        char[] ra = ransomNote.toCharArray();
        for (int i = 0; i < s1; i++) {
            int index = ra[i] - 97;
            a[index]--;
            if (a[index] < 0) return false;
        }
        return true;
    }
}
