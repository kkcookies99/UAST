 int XXX(int* nums, int numsSize){
    int max=0,temp=0,t=0;
    for(int i=0;i<numsSize;i++)
    {
        temp+=nums[i];
        if(temp<0)
        temp=0;
        if(max<=temp)
        max=temp;
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
    return max;
}

