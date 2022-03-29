 class Solution {
    public int XXX(int[] nums, int val) {
        int j=nums.length-1;
        int k=0;
        if(j==0 && nums[0]!=val)
        return 1;
    for (int i =0;i<nums.length;i++)
    {
        while(nums[j]==val && j!=0)
        {
        if(j>=1)
          j--;
        }
        if(j==0 &&nums[j] != val)
        return 1;
        k=j;
        if (nums[i]==val && i<k)
        {
            nums[i] = nums[k];
            nums[k] = val;
            k--;
        }
    }
    return j==0?j:k+1;
    }
} 

