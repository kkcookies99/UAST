 int XXX(int* nums, int numsSize, int val){
    int left = 0, right = numsSize - 1;
    while(right > left)
    {
        while(right > 0 && nums[right] == val) --right;
        while(left < numsSize && nums[left] != val) ++left;
        if(right < left)
            break;
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left ++;
        right --;
    }
    while(right >=0 && nums[right] == val)
        right--;
    return right+1;
}

