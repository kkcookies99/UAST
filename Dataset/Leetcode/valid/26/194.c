 int XXX(int* nums, int numsSize){
    int i = 0,j = 0;
    while(j < numsSize){
        while(j + 1 < numsSize&&nums[j] == nums[j+1])++j;
        nums[i++] = nums[j++];
    }
    return i;
}

