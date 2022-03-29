class Solution {
    public int XXX(int[] nums) {
        int res=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=sum>0?sum+nums[i]:nums[i];
            res=Math.max(res,sum);
        }
        return res;
    }
}

