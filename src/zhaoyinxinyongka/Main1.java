package zhaoyinxinyongka;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(process(s.toCharArray()));
    }

    public static int process(char[] arr) {
        int size = arr.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 'C') {
                count++;
                sum += i;
            }
        }
        boolean moveC = count < size - count;
        // 鸡左
        boolean CmoveL = 2 * sum < size * count;
        int res = 0;
        int k;
        char o = moveC ? 'C' : 'D';
        if ((moveC && CmoveL) || (!moveC && !CmoveL)) {
            k = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] == o) {
                    res += i - k;
                    k++;
                }
            }
        } else {
            k = size - 1;
            for (int i = size - 1; i >= 0; i--) {
                if (arr[i] == o) {
                    res += k - i;
                    k--;
                }
            }
        }


        return res;
    }
}
