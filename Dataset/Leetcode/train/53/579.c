 int XXX(int* nums, int numsSize){
    int max=0;
    int t=0;
    for(int i=0;i<numsSize;i++)
    {
        int temp=0;
        for(int j=i;j<numsSize;j++)
        {
            temp+=nums[j];
            if(max<=temp)
            max=temp;
        }
    }
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]<0)
        t++;
    }
    if(t==numsSize)
    {
        int m=nums[0];
        for(int i=0;i<numsSize;i++)
        {
            if(m<=nums[i])
            m=nums[i];
        }
        return m;
    }
    else return max;
}

