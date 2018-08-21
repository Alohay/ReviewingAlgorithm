package leetcode;

public class Code_58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        int size = res.length;
        if (size == 0) {
            return 0;
        }
        return size > 1 ? res[size - 1].length() : res[0].length();
        //        return s.substring(s.lastIndexOf(' ') + 1).length();
    }

    public static int test(String s){
        return s.trim().substring(s.lastIndexOf(' ') + 1).length();
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("HelloWOr"));
        System.out.println(test("HelloWOr"));
    }
}
