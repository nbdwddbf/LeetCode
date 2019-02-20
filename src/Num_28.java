/**
 * @Auther: dabuff
 * @Date: 19-2-20 10:33
 * @Description:
 */
public class Num_28 {
    public static void main(String[] args) {
        String haystack = "gudfuu";
        String needle = "dfu";
        Solution_28 solution = new Solution_28();
        int result = solution.strStr_1(haystack, needle);
        System.out.println(result);
    }
}

class Solution_28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr_1(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        if (needle.length() > haystack.length())
            return -1;

        int i, j = 0;
        for (i = 0; i < haystack.length(); i++) {
            if (j == needle.length())
                return i - j;
            if (haystack.charAt(i) == needle.charAt(j)){
                System.out.println(haystack.charAt(i));
                j++;
            }

            else {
                i -= j;
                j = 0;
            }
        }
        if (j == needle.length())
            return i - needle.length();

        return -1;
    }
}