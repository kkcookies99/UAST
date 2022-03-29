 class Solution {
    public void XXX(int[] nums) {
        int left=0,current=0,right=nums.length-1;
        while(left<=right)
        {
        	if(left<=right&&nums[left]==2)
        		swap(nums,left,right--);
        	else
        		if(left<=right&&nums[left]==0)
        			swap(nums,left++,current++);
        		else
                    if(left<=right&&nums[left]==1)
        			swap(nums,current,left++);
        			
        }
    }
    public void swap(int nums[],int i,int j)
    {
    	int temp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=temp;
    }
}```
