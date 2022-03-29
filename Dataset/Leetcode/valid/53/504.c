 int XXX(int* nums, int numsSize){
    int max=nums[0],pre=0;
    for(int i=0;i<numsSize;i++){
        if(pre<0){    //最大子串应该满足,其任意左右端子串和大于0
            pre=nums[i];
        }else{
            pre=pre+nums[i];
        }
        if(pre>max){ //比较新子串和与原来的最大字串和的大小,取大的那个
            max=pre;
        }
    }
    return max;
}

