 int XXX(int* nums, int numsSize, int val){
    int len = 0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[len++] = nums[i];
        }
    }
    return len;
}

