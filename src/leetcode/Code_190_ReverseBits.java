package leetcode;

public class Code_190_ReverseBits {
    public static int reverseBits(int n) {
        int res = n & 1;
        n >>= 1;
        for (int i = 0; i < 31; i++) {
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        // 00111001011110000010100101000000
        // 00000010100101000001111010011100
        System.out.println(reverseBits(43261596));
    }

}
