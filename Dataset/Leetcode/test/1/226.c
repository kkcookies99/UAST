 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int* returnArray = (int*)malloc(2*sizeof(int));
    for(int i = 0;i<numsSize;i++)
    {
        for(int j = i+1;(j<numsSize && j != i);j++)
        {
            if(nums[i] + nums[j] == target)
            {
                returnArray[0] = i;
                returnArray[1] = j;
            }
        }
    }
    // *returnSize使用指针 改变调用函数里的值
    //返回数组的大小为2
    *returnSize = 2;
    return returnArray;
}

