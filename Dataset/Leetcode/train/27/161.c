 int XXX(int* nums, int numsSize, int val){
    int j = 0;
    for(int i = 0;i<numsSize;)
    {
        if(nums[i]!=val)nums[j++] = nums[i++];
        else ++i;
    }
    return j;
}