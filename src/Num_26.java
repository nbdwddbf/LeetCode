/**
 * @Auther: dabuff
 * @Date: 19-2-18 10:33
 * @Description:
 */
public class Num_26 {
    public static void main(String[] args) {
        Solution_26 solution = new Solution_26();
        int[] nums = new int[]{0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        int len = solution.removeDuplicates_1(nums);
        System.out.println(len);
    }

}

class Solution_26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;

        int num = 0;
        int i, j;
        for (i = 0; i < nums.length; ) {
            for (j = i + 1; j < nums.length - 1; ) {
                while (nums[j] == nums[i])
                    j++;
                break;

            }
            nums[num] = nums[i];
            num++;
            i = j;
        }
        for (int k = 0; k < num - 1; k++)
            System.out.print(nums[k]);
        System.out.println();
        return num - 1;
    }

    public int removeDuplicates_1(int[] nums) {
        if (nums == null)
            return 0;

        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] != nums[j])
                nums[++i] = nums[j];
            j++;
        }

        return i + 1;
    }
}