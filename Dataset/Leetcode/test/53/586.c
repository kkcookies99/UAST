 int XXX(int* nums, int numsSize){
    int max = nums[0];
    int d = 0;
    if(numsSize == 1)return nums[0];
    while(d <= numsSize - 1){
        for(int i = 0; i < numsSize - d; ++i){
            int sum = 0;
            for(int j = i; j <= i + d; ++j){//每个子序列的和,间隔为d
                sum += nums[j];
            }//for
            if(sum > max)max = sum;
        }
        ++d;
    }
    return max;
}

