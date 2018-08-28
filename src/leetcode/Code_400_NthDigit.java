package leetcode;

public class Code_400_NthDigit {
    public static int findNthDigit(int n) {
        int i = 1;
        long p = 1;
        int c = n;
        while ((n - 1) / (9 * i * p) != 0) {
            c -= 9 * i * p;
            i++;
            p *= 10;
        }
        int m = (c - 1) / i;
        int k = (c - 1) % i;
        long num = p + m;
//        return (num + "").charAt(k) - 48;
        k = i - k -1;
        while (k > 0) {
            num /= 10;
            k--;
        }
        return (int)num % 10;
    }

    public static void main(String[] args) {
//        for (int i = 1; i < 100; i++) {
//            System.out.print(findNthDigit(i));
//
//        }

        System.out.println(findNthDigit(2147483647));
    }
}
