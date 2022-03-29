 class Solution {
    public boolean XXX(int[] nums) {
        int n=nums.length,maxLen=nums[0];
        if(n==1) return true;
        for(int i=1;i<n;i++){
            if(i<=maxLen) //maxLen是当前可能到达的最远距离
                maxLen=Math.max(maxLen,i+nums[i]);
            if(maxLen>=n-1)  
                return true;//说明可以到达最后一个位置
        }
        return false;
    }
}

