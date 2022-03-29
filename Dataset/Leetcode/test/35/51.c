 int XXX(int* nums, int numsSize, int target){
    int left=0,right=numsSize-1,mid=left+(right-left)/2;
    while(left<right)
    {
        if(nums[mid]<target)
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
        mid=left+(right-left)/2;
    }
    
    if(nums[mid] < target){
    return mid+1;
    }
    return mid;
}

