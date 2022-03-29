 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int *returnNums = (int *)malloc(sizeof(int)*2);
    for(int i = 0;i < numsSize - 1;i++)
    {
        for(int j = i+1;j < numsSize;j++)
        {
            if(nums[i] + nums[j] == target)
            {
                returnNums[0] = i;
                returnNums[1] = j;
                break;

            }
        }
    }
    *returnSize = 2;
    return returnNums;
}

