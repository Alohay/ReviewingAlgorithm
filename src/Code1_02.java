import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code1_02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // ?
        in.nextLine();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = in.nextLine().split(";");
//            String[] tmp = input[0].split(",");
//            if (i == 0)
//            list.add(new int[]{Integer.valueOf(tmp[0]), Integer.valueOf(tmp[1]),});
            int size = input.length;
            for (int j = 0; j < size; j++) {
//                tmp = input[j].split(",");
                String[] tmp = input[j].split(",");
                list = insert(list, new int[]{Integer.valueOf(tmp[0]), Integer.valueOf(tmp[1]),});
            }
        }
        printArr(list);
    }

    public static void printArr(List<int[]> arr) {
        int size = arr.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr.get(i)[0]).append(",").append(arr.get(i)[1]).append(";");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }

    public static List<int[]> insert(List<int[]> list, int[] item) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        for (; i < list.size() && list.get(i)[1] < item[0]; i++) {
            result.add(list.get(i));
        }
        for (; i < list.size() && list.get(i)[0] <= item[1]; i++) {
            item[0] = Math.min(item[0], list.get(i)[0]);
            item[1] = Math.max(item[1], list.get(i)[1]);
        }
        result.add(item);
        while (i < list.size()) {
            result.add(list.get(i++));
        }
        return result;
    }

}
