 class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int frontBound = nums[0];
        for (int i = 0; i < len; i++) {
            if(i<=frontBound && nums[i]+i>frontBound) frontBound = nums[i]+i;
            if(frontBound>=len-1) return true;
        }
        return false;
    }
}

