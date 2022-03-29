 class Solution {
    public int XXX(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
                k++;
            else
                nums[i-k]=nums[i];
        }
        return nums.length-k;
    }
}

