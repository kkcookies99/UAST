class Solution {
    public boolean XXX(int[] nums) {
         int n = nums.length-1,end = nums.length-1;
        for (int i = n-1; i >=0 ; --i) {
            if (i+nums[i]>=end)
                end = i;
        }
        return end==0;
    }
}

