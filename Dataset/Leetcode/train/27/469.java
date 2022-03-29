 class Solution {
    public int XXX(int[] nums, int val) {
        int c = 0;//记录第几个不等于val
            for(int i=0;i<nums.length;i++)
            if(nums[i]!=val)
            {
                nums[c] = nums[i];
                c++ ;
            }

            return c;
    }
}

