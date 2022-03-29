 class Solution {
    public int XXX(int[] nums) {
        int sum = 0;
        int ans = nums[0];

        for(int i = 0; i < nums.length; i++ ) {
/**           遍历子序列，和应该是逐渐增大的，如果遍历到总和小于0的情况，这个子序列就不是题需要的序列
 *            提问：为什么边界条件是总和小于0?
 */
            if(sum < 0)  
                sum = nums[i]; 
            else 
                sum += nums[i];  
            ans = Math.max(ans,sum);
        }
       
        return ans;
    }
}

