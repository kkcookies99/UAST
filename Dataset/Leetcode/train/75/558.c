 void XXX(int* nums, int numsSize){
    int i = 0;
    int j = numsSize -1;
    int k = 0;
        
    while(k < numsSize)
    {
        if(nums[k] == 0)
        {
           nums[i]^=nums[k]^=nums[i]^=nums[k];
            i++;
            k++;
        }
        else if(nums[k] == 2 )
        {
            if(k < j)
            {
                nums[j]^=nums[k]^=nums[j]^=nums[k];
                j--;
            }
            else k++;
        }
        else if(nums[k] == 1)
        {
            k++;
        }
    }
}

