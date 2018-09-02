package leetcode;

public class Code_443_StringCompression {
    public static int compress(char[] chars) {
        if (chars == null) return 0;
        int size = chars.length;
        if (size == 0 || size == 1) return size;
        char c = chars[0];
        int count = 1;
        int res = 0;
        for (int i = 1; i < size; i++) {
            if (chars[i] == c) {
                count++;
            } else {
                chars[res++] = c;
                c = chars[i];
                if (count == 1){
                    continue;
                }
                int m = 1;
                while (count / m >= 10) m *= 10;
                while (m > 0) {
                    int t = count / m;
                    chars[res++] = (char) ('0' + t);
                    count %= m;
                    m /= 10;
                }
                count = 1;
            }
            if (i == size - 1) {
                if (count > 1) {
                    int m = 1;
                    while (count / m >= 10) m *= 10;
                    chars[res++] = c;
                    while (m > 0) {
                        int t = count / m;
                        chars[res++] = (char) ('0' + t);
                        count %= m;
                        m /= 10;
                    }
                } else {
                    chars[res++] = c;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[] chars = new char[]{ 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
//        char[] chars = new char[]{'a', 'b', 'c'};
        int n = compress(chars);
        System.out.println(n);
        System.out.println(chars);
    }
}
