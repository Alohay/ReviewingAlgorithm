package c_2;

public class Code_05_Manacher_ShortestEnd {

    public static void main(String[] args) {
        System.out.println(shortestEnd("1234"));
    }

    public static String shortestEnd(String str) {
        if (str == null || str.length() == 0) return str;
        char[] ss = manacherString(str);
        int size = ss.length;
        int c = -1;
        int r = -1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i < r ? Math.min(r - i, arr[2 * c - i]) : 1;
            while (i + arr[i] < size && i - arr[i] > -1
                    && ss[i + arr[i]] == ss[i - arr[i]]) {
                arr[i]++;
            }
            if (i + arr[i] > r) {
                c = i;
                r = i + arr[i];
            }
            if (r == size) {
                break;
            }
        }
        int m = (c - arr[c])/2;
        StringBuilder sb = new StringBuilder(str);
        while (m >= 0) {
            sb.append(str.charAt(m--));
        }
        return sb.toString();
    }


    public static char[] manacherString(String str) {
        char[] charArr = str.toCharArray();
        char[] res = new char[str.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : charArr[index++];
        }
        return res;
    }
}
