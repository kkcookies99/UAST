 int singleNumber(int* nums, int numsSize) {
    if (NULL == nums || numsSize == 0)
     assert (0);
    int compare_pos = 0;
    int idx = compare_pos + 1;
    while (idx < numsSize)
    {
        if (nums[idx] == nums[compare_pos])
        {
            int tmp = nums[idx];
            nums[idx] = nums[compare_pos+1];
            nums[compare_pos+1] = tmp; 
            compare_pos += 2;
            idx = compare_pos + 1;
        }
        else
        {
            ++idx;
       }
        if (compare_pos == numsSize - 1)
            break;
    }
     return nums[compare_pos];
}

