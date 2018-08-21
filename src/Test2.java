import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][2];
        PriorityQueue<int[]> smallHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        for (int i = 0; i < size; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
            smallHeap.add(arr[i]);
        }
//        int[] res = process(smallHeap);

//         size = res.length;

        for (int i = 0; i < size; i++) {
            System.out.print(size + " ");
        }
    }

//    public static int[] process(PriorityQueue<int[]> smallHeap) {
//        int size = smallHeap.size();
//        int[] res = new int[size];
//        while (!smallHeap.isEmpty()) {
//            int[] tmp = smallHeap.poll();
//            if (!smallHeap.isEmpty()) {
//
//            }
//        }
//
//    }
}
