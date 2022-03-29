 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    returnSize = (int *)malloc(sizeof(int) * 2);
    for (int i = 0; i < numsSize - 1; i++) {
        for (int j = i + 1; j < numsSize; j++) {
            if (nums[i] + nums[j] == target){
                returnSize[0] = i;
                returnSize[1] = j;
                return returnSize;
            }
        }
    }
    return 0;
}

