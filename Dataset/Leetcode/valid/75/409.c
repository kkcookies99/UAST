 void XXX(int* nums, int numsSize){
    int t[3] = {0};
    for(int i = 0; i < numsSize; i++)
    {
        t[nums[i]]++;
    }
    int cnt = 0;
    for(int i = 0; i < 3; i++)
    {
        while(t[i]-- != 0)
        {
            nums[cnt++] = i;
        }
    }
}

