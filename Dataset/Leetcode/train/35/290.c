 int XXX(int* nums, int numsSize, int target){
    int right = 0,left = numsSize - 1,mid = 0;
    while(right<=left)
    {
        mid = (right+left)/2;
        if(nums[mid] == target) break;
        else if(nums[mid] > target) left = mid - 1;
        else right = mid + 1;
    }
    for(int i = mid; i < numsSize; i++) {
        if(nums[i] < target) mid++;
    }
    return mid;
}

