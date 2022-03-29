class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length <= 1) return true;
        // 用maxPos标记在当前位置能跳到的最远距离
        int maxPos = nums[0];
        for(int i = 0; i < nums.length && i <= maxPos; i++) {
            // 每往前一格就去更新maxPos
            maxPos = Math.max(maxPos, i + nums[i]);
            if(maxPos >= nums.length - 1) return true;
        } 
        return false;
    }
}

