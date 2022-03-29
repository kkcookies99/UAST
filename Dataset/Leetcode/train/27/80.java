 class Solution {
    public int XXX(int[] nums, int val) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            // 找到第一次出现val的位置
            if (index == -1 && nums[i] == val) {
                index = i;
            }
            // 如果出现过val，并且遍历到了非val的值，则交换它们
            if (nums[i] != val && index != -1) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index++] = tmp;
            }
        }

        // 没有找到val，则返回原数组的长度，否则返回val的索引
        return index == -1 ? nums.length : index;
    }
}

