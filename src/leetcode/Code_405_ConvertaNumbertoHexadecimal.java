package leetcode;

public class Code_405_ConvertaNumbertoHexadecimal {
    public static String toHex(int num) {
        boolean negative = false;
        if (num == 0) return "0";
        if (num == Integer.MIN_VALUE) return "80000000";
        if (num < 0) {
            negative = true;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int m = 0;
        while (num != 0) {
            int c = num % 16;
            if (negative) {
                c = 16 - i - c + m;
                m = c >= 16 ? 1 : 0;
                c = c % 16;
                i = 1;
            }
            if (c < 10) {
                sb.append(c);
            } else {
                sb.append((char) (c + 87));
            }

            num /= 16;
        }
        while (negative && sb.length() < 8) {
            sb.append('f');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-10000));
    }
}
