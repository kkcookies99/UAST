 public int XXX(int[] nums, int target) {
    int len=nums.length,left=0,right=len-1,mid=0;
    if(len==0) return 0;
    if(nums[0]>=target) return 0;
    if(nums[len-1]<target) return len;
    while(left<=right)
    {  
        mid=(left+right)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]<target)
             left=mid+1;
        else if(nums[mid]>target)
             right=mid-1;  
    }
            return left;        
}

