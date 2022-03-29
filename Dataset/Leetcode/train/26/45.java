 class Solution {
    public int XXX(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; --i) {
            if (nums[i] == nums[i - 1]) {
                --len;
                int tmp = nums[i];
                nums[i] = nums[len];
                nums[len] = tmp;
            }
        }
        // 以上解法可以删除重复元素了，删除之后是乱序的
        Arrays.sort(nums, 0, len);
        return len;
    }
}

