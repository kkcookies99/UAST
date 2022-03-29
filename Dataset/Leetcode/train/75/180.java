class Solution {
    public void XXX(int[] nums) {
        int len=nums.length;
        int i=0;
        int j=0;
        int col=0;
       while(i<len)
        {
            if(j<len)
            {
                if(nums[j]==col)
                {
                int tar=nums[j];
                nums[j]=nums[i];
                nums[i]=tar;
                i++;
                j++;
                }
                else{
                    j++;
                }
            }
            else
            {
                j=i;
                col++;
            }
        }
    }
}

