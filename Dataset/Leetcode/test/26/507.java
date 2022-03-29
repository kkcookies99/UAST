 class Solution {
    public int XXX(int[] nums) {
        if (nums == null) return 0;
        if (nums.length <= 1) return nums.length;
        // 当前待覆盖数据的指针
        int pos = 1;
        // 待比较重复的值
        int tempVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempVal == nums[i]) continue;
            nums[pos++] = nums[i];
            tempVal = nums[i];
        }
        return pos;
    }
}

