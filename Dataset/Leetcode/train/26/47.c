 int XXX(int* nums, int numsSize){
    if(numsSize==0) return 0;
    int k=0;
    for(int i=1;i<numsSize;i++)
        if(nums[i]!=nums[i-1]) nums[++k]=nums[i];
    return k+1;
}

