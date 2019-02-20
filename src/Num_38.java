/**
 * @Auther: dabuff
 * @Date: 19-2-20 15:26
 * @Description:
 */
public class Num_38 {
    public static void main(String[] args) {
        Solution_38 solution = new Solution_38();
        String result = solution.countAndSay_1(6);
        System.out.println(result);
    }
}

class Solution_38 {
    public String countAndSay(int n) {

        return countAndSay("1", 1, n);
    }

    //递归方法
    private String countAndSay(String s, int depth, int n) {
        if (depth == n)
            return s;

        String ans = "";
        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
                cnt++;
            else {
                ans += cnt + "" + s.charAt(i);
                cnt = 1;
            }
        }

        return countAndSay(ans, depth + 1, n);
    }

    //非递归
    public String countAndSay_1(int n) {
        String s = "1";

        int cnt = 1;
        for (int i = 1; i < n ; i++) {
            String ans = "";
            for (int j = 0; j < s.length(); j++) {

                if (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                    cnt++;
                } else {
                    ans += cnt + "" + s.charAt(j);
                    cnt = 1;
                }
            }
            s = ans;
        }

        return s;
    }
}