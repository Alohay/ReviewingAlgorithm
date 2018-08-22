import java.util.HashMap;

public class Code_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int size = s.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < size; i++) {
            Character si = s.charAt(i);
            Integer oldIndexS = map1.put(si, i);
            Character ti = t.charAt(i);
            Integer oldIndexT = map2.put(ti, i);
            if ((oldIndexS != null) && !oldIndexS.equals(oldIndexT)) {
                return false;
            } else if (oldIndexS == null && oldIndexT != null) {
                return false;
            }
        }
        return true;
    }
}
