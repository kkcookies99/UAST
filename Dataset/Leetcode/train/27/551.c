 int XXX(int* nums, int numsSize, int val){
    int length = 0; //初始长度
    int numsCount = 0;
    while(numsCount < numsSize)
    {
        if(nums[numsCount++] != val)
        {
            nums[length++] = nums[numsCount-1];
        }
    }
    return length;
}

