 int XXX(int* nums, int numsSize, int val){

    int i=0,j=0;

    for (;i<numsSize;i++)
    {
        if (nums[i] != val)
        {
            nums[j++] = nums[i];
        }
        
    }

    numsSize =j;

    return numsSize;

}

