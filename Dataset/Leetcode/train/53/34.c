int XXX(int* nums, int numsSize){
    int i;
    int sum = 0;
    int max = 0;
    for(i=0;i<numsSize;i++)
    {
        while(sum>=0&&i<numsSize)
        {
            sum += nums[i];
            if(nums[i+1]<0&&sum>max)
            {
                max=sum;
            }
            i++;
        }
        if(sum<0) sum=0;
    }
    return sum;
}

