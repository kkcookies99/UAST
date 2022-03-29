 class Solution {
    public boolean XXX(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length && i<=max;++i)
        {
            if(i+nums[i]>max)
            {
                max=i+nums[i];
            }
        }
        return max>=nums.length-1;
    }
}

