int singleNumber(int* nums, int numsSize) {
    int num=nums[0];
    for(int i=1; i<numsSize; i++){
        num ^=nums[i];
    }
    return num;
}

