package leetcode;

public class Code_28_KMP {

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.equals("")) {
            return 0;
        }
        int[] next = getNextArr(needle.toCharArray());
        int p1 = 0;
        int p2 = 0;
        int size1 = haystack.length();
        int size2 = needle.length();
        while (p1 < size1 && p2 < size2) {
            if (haystack.charAt(p1) == needle.charAt(p2)) {
                p1++;
                p2++;
            } else if (p2 > 0) {
                p2 = next[p2];
            } else {
                p1++;
            }
        }
        return p2 == size2 ? p1 - p2 : -1;
    }

    public static int[] getNextArr(char[] arr) {
        int size = arr.length;
        if (size < 2) {
            return new int[]{-1, 0};
        }
        int[] next = new int[size];
        next[0] = -1;
        next[1] = 0;
        int pos = 0;
        int i = 2;
        while (i < size) {
            if (arr[i - 1] == arr[pos]) {
                next[i++] = ++pos;
            } else if (pos > 0) {
                pos = next[pos];
            } else {
                next[i++] = 0;
            }
        }
        return next;
    }

    public static void main(String[] args) {
//        "mississippi"
//        "issip"
        System.out.println(strStr("mississippi", "issip"));
    }
}
