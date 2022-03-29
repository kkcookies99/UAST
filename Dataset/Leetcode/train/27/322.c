 int XXX(int* nums, int numsSize, int val){
    int num = 0;
    for(int i=0;i<numsSize;++i){
        if(nums[i]!=val&&num==0)continue;
        else if(nums[i]==val){
            ++num;
        }else{
            nums[i-num] = nums[i];
        }
    }
    return numsSize-num;
}

