package webank;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 1; i < 7; i++) {
            arr[i] = in.nextInt();
        }
        process(arr);
        int[] ar1r[] = new int[2][2];
    }

    public static void process(int[] arr) {
        int res = arr[6];
//        arr[6] = 0;
        for (int i = 0; i < arr[5]; i++) {
            res += 1;
            if (arr[1] >= 11) {
                arr[1] -= 11;
            } else {
                arr[1] = 0;
            }
        }
//        arr[5] = 0;
        for (int i = 0; i < arr[4]; i++) {
            res += 1;
            if (arr[2] >= 5) {
                arr[2] -= 5;
            } else {
                int tmp = 5 - arr[2];
                arr[2] = 0;
                if (arr[1] > tmp * 4) {
                    arr[1] -= tmp * 4;
                } else {
                    arr[1] = 0;
                }
            }
        }
        for (int i = 0; i < arr[3]; i++) {
            res += 1;
            if (arr[3] >= 4) {
                arr[3] -= 4;
            } else {
                int tmp = 4 - arr[3];
                if (tmp == 3) {
                    arr[2] -= 4;
                    if (arr[1] >= 11) {
                        arr[1] -= 11;
                    } else {
                        arr[1] = 0;
                    }
                } else if (tmp == 2) {
                    arr[2] -= 3;
                    if (arr[1] >= 6) {
                        arr[1] -= 6;
                    } else {
                        arr[1] = 0;
                    }
                } else if (tmp == 1) {
                    arr[2] -= 1;
                    if (arr[1] >= 5) {
                        arr[1] -= 5;
                    } else {
                        arr[1] = 0;
                    }
                } else {
                    int tmpp = tmp - arr[2];
                    if (arr[1] >= tmp * 5 + tmpp * 9) {
                        arr[1] -= tmp * 5 + tmpp * 9;
                    } else {
                        arr[1] = 0;
                    }
                }
            }
        }
//        arr[3] = 0;
        for (int i = 0; i < arr[2]; i++) {
            res += 1;
            if (arr[2] >= 9) {
                arr[2] -= 9;
            } else {
                int tmp = 9 - arr[2];
                if (arr[1] >= tmp * 4) {
                    arr[1] -= tmp * 4;
                } else {
                    arr[1] = 0;
                }
            }
        }
        for (int i = 0; i < arr[1]; i++) {
            res += 1;
            if (arr[1] >= 36) {
                arr[1] -= 36;
            } else {
                arr[1] = 0;
            }
        }
        System.out.println(res);
    }
}
