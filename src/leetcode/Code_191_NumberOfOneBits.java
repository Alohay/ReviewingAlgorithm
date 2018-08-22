package leetcode;

public class Code_191_NumberOfOneBits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count = (n & 1) == 1 ? count + 1 : count;
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b10000000000000000000000000000000));
    }
}
