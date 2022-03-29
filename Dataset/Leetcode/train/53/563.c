 int XXX(int* nums, int numsSize){
    int sum1=0;
    int maxsum=-100000;
    for(int i=0;i<numsSize;i++)
    {
        sum1+=nums[i];
        if(maxsum<sum1)
            maxsum=sum1;
        if(sum1<0)
            sum1=0;
    }
    return maxsum;
}

