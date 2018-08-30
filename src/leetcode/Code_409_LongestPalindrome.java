package leetcode;

public class Code_409_LongestPalindrome {

    // TODO　WA
    public static int longestPalindrome(String s) {
        int[] arr = new int[52];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            int index = s.charAt(i) - 97;
            if (index >= 0) {
                arr[26 + index]++;
            } else {
                arr[s.charAt(i) - 65]++;
            }
        }
        int res = 0;
        int max = 0;
        for (int i = 0; i < 52; i++) {
            if ((arr[i] & 1) == 0) res += arr[i];
            else max = Math.max(max, arr[i]);
        }
        return res + max;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}