 int singleNumber(int* nums, int numsSize){
    int i, num = 0;
    for(i = 0;i < numsSize;i++)
    {
        num = num ^ nums[i];
    }
    return num;
}

