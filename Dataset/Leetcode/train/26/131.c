 bool IfDuplicate(int* nums,int len , int content){
    for (int i = 0; i < len; i++){
        if (content == nums[i]){
            return true;
        }
    }
    return false;
}
int XXX(int* nums, int numsSize){
    int len = 0;
    for (int i = 0; i < numsSize; i++){
        if (!IfDuplicate(nums, len, nums[i])){
            nums[len] = nums[i];
            len++;
        }
    }
    return len;
}

