class Solution {
    public boolean XXX(int[] nums) {
        int n =nums.length;
        if(n==1) return true;//只有一个元素，则一定是true
        int maxLen=nums[0];
        for(int i=1;i<n&&i<=maxLen;i++){
            maxLen=Math.max(maxLen,i+nums[i]);//更新所能到达的最远距离
            if(maxLen>=n-1) return true;//一旦能到达最远处，直接返回false
        }
        return false;
    }
}

