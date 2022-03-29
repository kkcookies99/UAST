 void XXX(int* nums, int numsSize){
    int num0 = 0,num1 = 0,num2 = 0;
    int i;
    for(i = 0;i < numsSize;i++)
    {
        if(0 == nums[i])
            num0++;
        else if(1 == nums[i])
            num1++;
        else
            num2++;
    }
    for(i = 0;i < numsSize;i++)
    {
        if(i < num0)
            nums[i] = 0;
        else if(i >= num0 && i < num1+num0)
            nums[i] = 1;
        else
            nums[i] = 2;
    }
}

