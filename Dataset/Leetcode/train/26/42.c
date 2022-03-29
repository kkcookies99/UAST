 int XXX(int* nums, int numsSize){
    if(numsSize<2)
        return numsSize;
    int i=0;
    int j=0;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]!=nums[i+1])
        {
            nums[++j]=nums[++i];
        }
    }
    return j+1;
}

