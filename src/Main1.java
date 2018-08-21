//public class Main1 {
//
//    public static int[] generateRandomArr(int n, int min, int max) {
//        int size = (int) (Math.random() * n);
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = min + (int) (Math.random() * (max - min + 1));
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 100) {
//            int n = (int) (Math.random() * 1000);
//            int[] interests = generateRandomArr(n, 1, 1000);
//            int[] status = generateRandomArr(n, 0, 1);
//            int size = interests.length;
//            int k = (int) (Math.random() * (size));
//            if (
////                    Code_01.process(interests, status, size, k)
//            Code_01_.process(interests, status, k, 0, size - 1)!=
//                    Code_01.process(interests, status, size, k)
////                            Code_01_.process(interests, status, k, 0, size - 1)
//                    ) {
//                System.out.println("o no");
//            }
//            i++;
//        }
//    }
//
//    public static int process(int[] a, int[] t, int k) {
////       int n = scanner.nextInt();
////       int k = scanner.nextInt();
////       scanner.nextLine();
////       String[] aString = scanner.nextLine().split(" ");
////       String[] tString = scanner.nextLine().split(" ");
////       int[] a = new int[n];
////       int[] t = new int[n];
////       for (int i = 0; i < n; i++) {
////           a[i] = Integer.parseInt(aString[i]);
////           t[i] = Integer.parseInt(tString[i]);
////       }
//        int n = a.length;
//        int maxGrade = 0;
//        int xingGrade = 0;
//        int maxXing = 0;
//        Boolean flag = true;
//        for (int i = 0; i < n; i++) {
//            if (t[i] == 1) {
//                maxGrade += a[i];
//            } else if (t[i] == 0 && flag) {
//                for (int j = i; j < i + k; j++) {
//                    if (j >= n) {
//                        break;
//                    }
//                    if (t[j] == 0) {
//                        xingGrade += a[j];
//                    }
//                }
//                if (xingGrade > maxXing) {
//                    maxXing = xingGrade;
//                }
//                xingGrade = 0;
//
//            }
//        }
////        System.out.println(maxGrade + maxXing);
//        return (maxGrade + maxXing);
//    }
//
//
//}
