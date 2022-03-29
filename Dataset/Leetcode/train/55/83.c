bool XXX(int* nums, int numsSize){
    if(numsSize==1) return true;
    if(nums[0]==0) return false;
    int i=0,tempi=0;
    do{
        int max=i+nums[tempi]; //max为该点最远能跳到的地方
        for(i=tempi;i<max;i++)
        {        
            if(i==numsSize-1) return true;
            if(nums[i]>nums[tempi]-(i-tempi)){
                tempi=i;
                break;
            }
        }
        if(i==numsSize-1) return true;
        if(i==max){
            if(nums[i]==0) return false;
            else   tempi=i;
        }   
    }
    while(i<numsSize);
    return true;
}

