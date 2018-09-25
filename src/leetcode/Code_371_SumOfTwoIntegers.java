package leetcode;

public class Code_371_SumOfTwoIntegers {
    public int getSum(int a, int b) {
//        int c = a ^ b;
//        a = (a & b) << 1;
//        b = c;
        int c;
        while (a != 0) {
            c = b ^ a;
            a = (a & b) << 1;
            b = c;
        }
        return b;
    }
}
