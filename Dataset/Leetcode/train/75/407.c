 void XXX(int* nums, int numsSize){
    int cnt0=0,cnt1=0,cnt2=0;
    for(int i=0; i<numsSize; i++)
    {
        if(nums[i]==0)
            cnt0++;
        else if(nums[i]==1)
            cnt1++;
        else
            cnt2++;
    } 
    for(int i=0;i<numsSize;i++)
    {
        if(cnt0-->0)
            nums[i]=0;
        else if(cnt1-->0)
            nums[i]=1;
        else
            nums[i]=2;
        
    }
    
}

