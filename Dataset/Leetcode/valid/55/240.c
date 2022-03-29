bool XXX(int* nums, int numsSize){
    int max=-1;
    if(numsSize==1&&nums[0]==0) return true;
    for(int i=0;i<numsSize;i++){
       max=max-1>nums[i]?max-1:nums[i];
       if (max==0 &&i<numsSize-1) return false;
    } 
    return true;
}

