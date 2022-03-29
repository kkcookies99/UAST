 int XXX(int* nums, int numsSize, int val){
    int index = 0;
    for(int i = 0;i<numsSize;i++){
        if(nums[i] != val)
            nums[index++] = nums[i];
    }
    return index;
}

