class Solution {
    public int XXX(int[] nums) {
        int length = nums.length;
        int maxSubSum[] = new int[length];
        
        int maxSub = nums[0];
        maxSubSum[0] = nums[0];        
        for(int i=1; i<length; i++){   
            maxSubSum[i] = Math.max(maxSubSum[i-1]+nums[i], nums[i]);
            maxSub = Math.max(maxSub, maxSubSum[i]);
        }
        
        return maxSub;
    }
}

