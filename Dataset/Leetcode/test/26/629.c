 int XXX(int* nums, int numsSize){
    if(numsSize==0) return 0;
    int slow=0;
    int fast=1;
    while(fast<numsSize)
    {
        if(nums[slow]==nums[fast])
        {
            nums[slow]=nums[fast++];
        }
        else
        { 
            nums[++slow]=nums[fast++];
        }
    }
    return slow+1;
}

