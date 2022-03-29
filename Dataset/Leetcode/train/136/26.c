 int singleNumber(int* nums, int numsSize){
    int a = 0, i;
    for (i = 0; i < numsSize; ++i)
    {
        a = a ^ nums[i];
    }
    return a;
}

