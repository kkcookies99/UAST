 int XXX(int* nums, int numsSize, int val){

    int i;
    int newIndex = 0;

    for(i=0; i<numsSize; i++)
    {
        nums[newIndex] = nums[i];
        if(nums[i] != val)
            newIndex++;
    }
    return newIndex;
}

