 int XXX(int* nums, int numsSize, int val){
    int n=numsSize;
    int low=0,high=numsSize-1;
    while(low<=high){
        if(nums[low]==val && nums[high]!=val){
            nums[low++]=nums[high--];
            n--;
        }else if(nums[low]!=val && nums[high]==val){
            high--;
            n--;
        }else if(nums[low]==val && nums[high]==val){
            high--;
            n--;
        }else if(nums[low]!=val && nums[high]!=val){
            low++;
        }
    }
    return n;
}

