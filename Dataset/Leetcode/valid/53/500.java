 class Solution {
    public int XXX(int[] nums) {
        int oldSum=nums[0];
        int preSum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum = preSum+nums[i];
            // 如果preSum大于nums[i] 
            if (preSum>nums[i]){
                //记得要时刻（每次加完之后）保存最大值
                if (preSum>oldSum){
                    oldSum = preSum;
                }
            }else {
                preSum = nums[i];
                if (oldSum < preSum){
                   oldSum = preSum;
                }
            }
        }
        return oldSum;
    }
}

