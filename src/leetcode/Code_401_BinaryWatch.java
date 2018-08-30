package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Code_401_BinaryWatch {

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }

    public static List<String> readBinaryWatch(int num) {
        return process(new int[10], 0, num);
    }

    public static List<String> process(int[] arr, int i, int rest) {
        List<String> res = new ArrayList<>();
        if (rest == 0) {
            String s = val(arr);
            if (s != null) res.add(s);
            return res;
        }
        if (i == 10) {
            return res;
        }
        arr[i] = 1;
        res.addAll(process(arr, i + 1, rest - 1));
        arr[i] = 0;
        res.addAll(process(arr, i + 1, rest));
        return res;
    }

    public static String val(int[] arr) {
        int h = 0;
        for (int i = 0; i < 4; i++) {
            h = (h << 1) + arr[i];
        }
        if (h > 11) return null;
        int m = 0;
        for (int i = 0; i < 6; i++) {
            m = (m << 1) + arr[i + 4];
        }
        if (m > 59) return null;
        StringBuilder sb = new StringBuilder();
        sb.append(h).append(":");
        if (m < 10) sb.append("0");
        sb.append(m);
        return sb.toString();
    }


    // TODO
//    public List<String> readBinaryWatch(int num) {
//        List<String> list = new ArrayList<>();
//        //用来表示时间的所有可能的取值
//        int timecode[] = new int[10];
//        dfs(timecode, 0, 0, list, num);
//        return list;
//    }
//
//    //  dfs 遍历所有可能性
//    private void dfs(int[] timecode, int i, int k, List<String> list, int num) {
//        if (k == num) {
//            String res = decodeToTime(timecode);
//            if (res != null)
//                list.add(res);
//            return;
//        }
//        if (i == timecode.length) return;
//        timecode[i] = 1;
//        dfs(timecode, i + 1, k + 1, list, num);
//        timecode[i] = 0;
//        dfs(timecode, i + 1, k, list, num);
//    }
//
//    //输出时间，即输出可能的时间，要是时间不对则输出null
//    private String decodeToTime(int[] timecode) {
//        int hours = 0;
//        //按照位数转换时间
//        for (int i = 0; i < 4; i++) {
//            if (timecode[i] == 1) {
//                hours = hours + (int) Math.pow(2, i);
//            }
//        }
//        int minutes = 0;
//        for (int i = 4; i < 10; i++) {
//            if (timecode[i] == 1) {
//                minutes = minutes + (int) Math.pow(2, i - 4);
//            }
//        }
//        String min = "" + minutes;
//        if (minutes < 10)
//            min = "0" + min;
//        //判断时间的可行性
//        if (hours >= 12 || minutes >= 60)
//            return null;
//        return hours + ":" + min;
//    }
}
