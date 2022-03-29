 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int n = 0,m = 0;

    for (;1;++n)
    {
        if (n > numsSize)
        {
            printf("对不起，没有找到答案！\n");
            *returnSize = -1;
            return returnSize;
        }

        if (nums[n] >= target )
            continue;
        

            m = 0;
            for (;1;m <= numsSize )
            {
                if (nums[n] + nums[m] == target)
                {
                    printf("[%d,%d]\n",n,m);

                    returnSize[0] = n;
                    returnSize[1] = m;
                    return returnSize;
                }
                else
                {
                    ++m;
                }
            }
        
    }
}

