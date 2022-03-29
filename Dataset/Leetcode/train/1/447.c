 int* XXX(int* nums, int numsSize, int target, int* returnSize){
    int i,j;
    *returnSize=2;
    int *ret=(int *)malloc(2*sizeof(int));
    for(i=0;i<numsSize-1;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                ret[0]=i;
                ret[1]=j;
                return ret;
            }
        }
    }
    return NULL;
}

