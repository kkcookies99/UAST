 int cmp(void *a ,void *b)
{
    return *(int *)a -*(int *)b;
}

int singleNumber(int* nums, int numsSize){
    qsort(nums,numsSize,sizeof(int),cmp);
    for(int i=0;i< numsSize-1;i = i+2)
    {
        if(nums[i]==nums[i+1])
        {
            continue;;
        }
        else
        {
            return nums[i];
        }
    }

    return nums[numsSize-1];
}

