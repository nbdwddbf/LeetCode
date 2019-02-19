/**
 * @Auther: dabuff
 * @Date: 19-2-18 11:29
 * @Description:
 */
public class Num_27 {
    public static void main(String[] args) {
        Solution_27 solution = new Solution_27();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int value = 0;
        int result = solution.removeElement_2(nums, value);
        System.out.println(result);
    }
}

class Solution_27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null)
            return 0;

        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
            } else {
                i++;
            }
        }

        return length;
    }

    public int removeElement_1(int[] nums, int val) {
        if (nums == null)
            return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement_2(int[] nums, int val) {
        if (nums == null)
            return 0;

        int length = nums.length;
        int i = 0;
        while (i < length){
            if (nums[i] == val){
                nums[i] = nums[length - 1];
                length--;
            }else i++;
        }

        return length;
    }
}