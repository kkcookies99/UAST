 class Solution {
    public int XXX(int[] nums) {
        if(nums == null) return 0;
        int length = nums.length;
        if(length == 1) return nums[0];
        int cur = -10010, res = -10020;
        for (int num : nums) {
            if (cur <= 0) cur = num;
            else cur += num;
            res = Math.max(cur, res);
        }
        return res;
    }
}

