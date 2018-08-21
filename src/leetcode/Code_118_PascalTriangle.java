package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Code_118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 1; i <= numRows; i++) {
            Integer[] arr = new Integer[i];
            arr[0] = 1;
            arr[i - 1] = 1;
            if (i > 2) {
                // cur index == i - 1
                List<Integer> before = list.get(i - 2);
                for (int j = 1; j < i - 1; j++) {
                    arr[j] = before.get(j - 1) + before.get(j);
                }
            }
            list.add(Arrays.asList(arr));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

}
