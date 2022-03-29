 class Solution {
    public int singleNumber(int[] nums) {
        int i,sum=0;
        for(i=0;i<nums.length;i++)
            sum^=nums[i];
            return sum;
    }
}

