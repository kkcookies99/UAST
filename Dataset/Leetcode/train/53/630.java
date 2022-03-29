 class Solution {
    public int XXX(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int pre=nums[0];
        int res=pre;
        for(int i=1;i<nums.length;i++){
            pre=pre>0 ? pre+nums[i] : nums[i];
            res=Math.max(pre,res);       
        }
        return res;
    }
}


