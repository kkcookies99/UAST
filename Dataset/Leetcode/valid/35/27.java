 class Solution {
    public int XXX(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return left;
    }
}

