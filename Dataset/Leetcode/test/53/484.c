 int XXX(int* nums, int numsSize){
int curnum = nums[0];
int maxnum = nums[0];
for(int i=1;i<numsSize;i++){
    curnum = curnum>0?curnum+nums[i]:nums[i];
    maxnum = maxnum>curnum?maxnum:curnum;
}
    return maxnum;
}

