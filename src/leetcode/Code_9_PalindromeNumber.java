package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Code_9_PalindromeNumber {

    public  boolean isPalindrome(int x) {
        if (x <= -x){
            return false;
        }
        List<Integer> l = process(x);
        int size = l.size();
        int count = l.size() / 2;
        int i = 0;
       while (i < count && l.get(i).equals(l.get(size -i -1))){
           i++;
       }
        return i == count;
    }

    public  List<Integer> process(int x){
        List<Integer> list = new ArrayList<>();
        int res = x % 10;
        while (res != 0 || x / 10 != 0){
            list.add(res);
            x -= res;
            x /= 10;
            res = x % 10;
        }
        return list;
    }
}
