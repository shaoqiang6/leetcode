package moveZeroes;

import org.junit.Test;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author shaoqiangyan
 */
public class Solution {

    public void removeZeros(int [] nums) {
        if (null == nums || nums.length <=1) {
            return;
        }
        int len = nums.length;
        int n = 0;
        for (int i = 0; i < len;i++) {
            if (nums[i] != 0) {
                nums[n] = nums[i];
                n++;
            }
        }
        while(n < len) {
            nums[n] = 0;
            n++;
        }
    }

    @Test
    public void test() {
        int[] nums = new int[] {0,1,0,3,12};
        removeZeros(nums);
        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }
}
