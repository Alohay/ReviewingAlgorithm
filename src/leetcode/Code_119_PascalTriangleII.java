package leetcode;

import java.util.*;

public class Code_119_PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<>();
        } else if (rowIndex < 1) {
            return Collections.singletonList(1);
        }
        Integer[][] res = new Integer[2][rowIndex + 1];
        res[0][0] = 1;
        res[0][1] = 1;
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = 1; j < i; j++) {
                res[1][j] = res[0][j] + res[0][j - 1];
            }
            res[1][i] = 1;
            for (int j = 1; j <= i; j++) {
                res[0][j] = res[1][j];
            }
        }

        return Arrays.asList(res[0]);
    }

    public static List<Integer> getRow1(int rowIndex) {
        List<Integer> ret = new LinkedList<Integer>();
        long nk = 1;
        for (int i = 0; i <= rowIndex; i++) {
            ret.add((int)nk);
            nk = nk * (rowIndex - i) / (i + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(getRow1(i));
        }
//            System.out.println(getRow1(3));
    }
}
