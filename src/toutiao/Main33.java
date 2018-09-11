package toutiao;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(process(s.toCharArray(), 0, 0));
        System.out.println(process1(s.toCharArray(), 0, 0));
    }

    public static int process(char[] arr, int i, int parts) {
        if (i > arr.length || parts > 4) {
            return 0;
        }
        if (i == arr.length) {
            return parts == 4 ? 1 : 0;
        }
        int res = process(arr, i + 1, parts + 1);
        if (arr[i] == '0') return res;
        res += process(arr, i + 2, parts + 1);
        if (arr[i] == '1') {
            res += process(arr, i + 3, parts + 1);
        } else if (arr[i] == '2') {
            if (i + 2 < arr.length && ((arr[i + 1] - '0') * 10 + (arr[i + 2] - '0') < 56)) {
                res += process(arr, i + 3, parts + 1);
            }
        }
        return res;
    }


    public static int process1(char[] chas, int i, int parts) {
        if (i > chas.length || parts > 4) {
            return 0;
        }
        if (i == chas.length) {
            return parts == 4 ? 1 : 0;
        }
        int res = process1(chas, i + 1, parts + 1);
        if (chas[i] == '0') {
            return res;
        }
        res += process1(chas, i + 2, parts + 1);
        if (i + 2 < chas.length) {
            int sum = (chas[i] - '0') * 100 + (chas[i + 1] - '0') * 10 + (chas[i + 2] - '0');
            if (sum < 256) {
                return res + process1(chas, i + 3, parts + 1);
            } else {
                return res;
            }
        } else {
            return res;
        }
    }
}

