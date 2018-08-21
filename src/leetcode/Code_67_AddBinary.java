package leetcode;

public class Code_67_AddBinary {
    public static String addBinary(String a, String b) {
        int size1 = a.length();
        int size2 = b.length();
        String minStr = size1 < size2 ? a : b;
        String maxStr = a != minStr ? a : b;
        size1 = minStr.length();
        size2 = maxStr.length();
        int des = size2 - size1;
        boolean f = false;
        char[] res = new char[size2];
        for (int i = size1 - 1; i >= 0; i--) {
            char c = minStr.charAt(i);
            int pos = des + i;
            if (c == maxStr.charAt(pos)) {
                res[pos] = f ? '1' : '0';
                f = c == '1';
            } else {
                res[pos] = f ? '0' : '1';
            }
        }
        for (int i = des - 1; i >= 0; i--) {
            if (maxStr.charAt(i) == '1') {
                res[i] = f ? '0' : '1';
            } else {
                res[i] = f ? '1' : '0';
                f = false;
            }
        }
        String s = f ? "1" : "";
        return s + String.valueOf(res);
    }

    public static void main(String[] args) {

        System.out.println(addBinary("110010", "10"));
//        System.out.println((char)0);
    }
}
