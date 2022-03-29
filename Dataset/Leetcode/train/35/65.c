 int XXX(int* nums, int numsSize, int target){
    int left=0;
    int right=numsSize-1;
    int ans=numsSize;
    int pivot=left+(right-left)/2;
    while(left<right)
    {
        if(nums[pivot]<target){
            left=pivot+1;
        }
        else{
            ans=pivot;
            right=pivot-1;
        }
    }
        return ans;
 }

