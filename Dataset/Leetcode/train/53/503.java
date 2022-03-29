 class Solution {
    public int XXX(int[] nums) {
        int pre=nums[0];
        int max=pre;
        for(int i=1;i<nums.length;i++){
            pre=Math.max(pre+nums[i],nums[i]);
            max=Math.max(pre,max);
        }
        return max;
    }
}

