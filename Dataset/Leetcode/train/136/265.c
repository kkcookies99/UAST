 int singleNumber(int* nums, int numsSize){
    for(; numsSize>1; numsSize--)
    {
        nums++;
        *nums ^= *(nums-1);
    }
    return *nums;
}

