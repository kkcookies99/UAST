 int XXX(int* nums, int numsSize){
    int count = (numsSize == 0) ? 0 : 1;
    int point = 1;
    for(int i = 0;i < numsSize;i++)
    {
        if(i > 0 && (nums[i] != nums[i - 1]))
        {
            nums[point++] = nums[i];
            count++;
        }
    }
    return count;
}
