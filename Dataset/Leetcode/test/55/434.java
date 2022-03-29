 class Solution {
    public boolean XXX(int[] nums) {
  // 3 2 1 0 5
        int fast=0;
        for (int i = 0; i < nums.length-1; i++) {
            //不断计算能跳跃的最远距离
            fast=Math.max(nums[i]+i,fast);
            if(fast==i){
                //可能遇到0了
                return false;
            }
        }
        return true;
    }
}

