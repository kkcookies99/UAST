 int XXX(int* nums, int numsSize){
int slow=0;
for(int fast=1;fast<numsSize;fast++){
    if(nums[fast]!=nums[slow]){
        slow++;
        nums[slow]=nums[fast];

    }
}
return slow+1;
}

