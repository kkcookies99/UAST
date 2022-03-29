 void XXX(int* nums, int numsSize){
    int red=0,blue=numsSize-1;
    int i=0,temp;
    while(i<=blue)
    {
        if(nums[i]==0)
        {
            temp=nums[red];
            nums[red]=nums[i];
            nums[i]=temp;
            red++;
            i++;
        }
        else if(nums[i]==2)
        {
            temp=nums[blue];
            nums[blue]=nums[i];
            nums[i]=temp;
            blue--;
        }
        else
            i++;
    }
    return;
}

