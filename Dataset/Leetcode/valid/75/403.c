 void XXX(int* nums, int numsSize){
    int left=0,right=numsSize-1;
    for(int i=0;i<=right;)
    {
        if(nums[i]==0)
        {
            nums[i]=nums[left];
            nums[left]=0;
            i++;
            left++;
        }
        else if(nums[i]==2)
        {
            nums[i]=nums[right];
            nums[right]=2;
            right--;
        }
        else
            i++;
    }
}

