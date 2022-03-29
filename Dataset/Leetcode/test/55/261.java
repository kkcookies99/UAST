class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1;i<len;i++){
            if(i==len-1){
                dp[i] = dp[i-1];
                continue;
            }
            if( dp[i-1]>=i && nums[i]+i>=dp[i-1] ){
                dp[i] = nums[i]+i;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[len-1]>=len-1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


