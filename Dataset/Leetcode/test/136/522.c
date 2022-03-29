 int singleNumber(int* nums, int numsSize){
    int sglNum = 0;
    int i = 0;
    while (i != numsSize) {
        sglNum ^= nums[i++];
    }
    return sglNum;
}

