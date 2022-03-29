 class Solution {
    public int XXX(int[] nums) {
        int dp = nums[0];
        int maxSub=dp;
        int i=1;
        while(i<nums.length){
            dp=Math.max( dp + nums[i],nums[i]);
            maxSub = Math.max(maxSub,dp);
            i++;
        }
        return maxSub;

    }
}

