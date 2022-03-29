 class Solution {
    public void XXX(int[] nums) {
     //尝试遍历一次的算法
        //当前该放红色的位置
        int redindex=0;
        //当前该放蓝色的位置
        int blueindex=nums.length-1;
        for(int i=0;i<=blueindex;i++)
        {
            //i>=redindex;所以nums[redindex]要么是0，要么是1。
            if(nums[i]==0)
            {
                nums[i]=nums[redindex];
                nums[redindex]=0;
                redindex++;
            }
            //而这里我们不确定其是0，1，2.所以要停在原地，
            else if(nums[i]==2)
            {
                nums[i]=nums[blueindex];
               
                nums[blueindex]=2;
                     i--;
                blueindex--;
               
            }
        }
    }
}

