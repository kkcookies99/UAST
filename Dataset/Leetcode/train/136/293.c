 int singleNumber(int* nums, int numsSize){
    for(int i=1;i<numsSize;i++){
        nums[0]^=nums[i];
    }
    return nums[0];
}

