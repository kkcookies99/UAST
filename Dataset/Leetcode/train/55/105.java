class Solution {
    public boolean XXX(int[] nums) {
        // pre表示 从后往前遍历中 最近一个可以达到末尾的元素的索引
        int pre = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // 如果当前元素值加上索引等于或者超过 上一个能到达末尾元素的索引，保存该索引
            if (i + nums[i] >= pre) {
                pre = i;
            }
        }
        // 判断第一个元素是最近一个能到达末尾元素的索引
        return pre == 0;
    }
}

