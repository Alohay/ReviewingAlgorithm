import java.util.Scanner;

public class Main22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(process(s));
    }

    public static int process(String s) {
        String tmp = s.substring(s.indexOf("2018") + 1);
        int res = Integer.valueOf(tmp);

        tmp = s.substring(s.indexOf("201") + 1, s.indexOf("8"));
        res += Integer.valueOf(tmp);

        tmp = s.substring(s.indexOf("20") + 1, s.lastIndexOf("18"));
        res += Integer.valueOf(tmp);


        tmp = s.substring(s.indexOf("2") + 1, s.lastIndexOf("018"));
        res += Integer.valueOf(tmp);

        tmp = s.substring(0, s.lastIndexOf("2018"));
        res += Integer.valueOf(tmp);


        return res;
    }
}
