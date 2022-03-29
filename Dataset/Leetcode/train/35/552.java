 class Solution {
    public int XXX(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if(target<nums[left]){
            return 0;
        }else if(target>nums[right]){
            return nums.length;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
                
            }else if(nums[mid]>target){
                right=mid-1;
                if(nums[right]<target){
                    return right+1;
                }
            }else{
                left=mid+1;
                if(nums[left]>target){
                    return left;
                }
            }
        }
        return -1;
    }
    
}

