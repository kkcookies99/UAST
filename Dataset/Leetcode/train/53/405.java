 class Solution {
    public int XXX(int[] nums) {
        int len=nums.length;
        if(len==1)
            return nums[0];
        int sum=0;
        int max=-999999;
        int maxNum=nums[0]; 
        for(int i=0;i<len;i++)
        {
            if(maxNum<nums[i])
                maxNum=nums[i];
            if(sum+nums[i]<=0)
                sum=0;
            else
            {
                sum+=nums[i];
                max=Math.max(max,sum);
            }
        }
        return max>maxNum?max:maxNum;
    }
}

