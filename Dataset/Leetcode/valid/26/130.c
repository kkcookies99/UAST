 int XXX(int* nums, int numsSize){
    if(numsSize <= 1) {
        return numsSize;
    }
    
    int k = 0;
    for(int i = 1; i < numsSize; i++){
        if(nums[k] != nums[i]){
            nums[++k] = nums[i];
        }
    }
    return ++k;
}

