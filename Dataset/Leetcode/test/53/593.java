 class Solution {
    public int XXX(int[] nums) {
        //动态规划
        
        for(int i = 0;i<nums.length;i++) {
            if(i == 0)
                continue;
            if(nums[i-1]>0)
                nums[i]+=nums[i-1]; //反之不变
        }

        int max = nums[0];
        for(int i : nums) {
            if(max<i)
                max = i;
        }
        
        return max;
    }
}

