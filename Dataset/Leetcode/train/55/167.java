class Solution {
    public boolean XXX(int[] nums) {
       int len = nums.length;
        boolean[] dp = new boolean[len];
        dp[0] = true;    
        for(int i=0;i<len;i++){
            if(dp[i]){
                int c = nums[i]+i;
                if(c>=len) return true;
                while(c>i&&!dp[c]){
                    if(!dp[c])
                        dp[c--] = true;
                }     
            }else break;  
        }
        return dp[len-1];
    }
}

