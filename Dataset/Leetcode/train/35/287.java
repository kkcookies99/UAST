 class Solution {
    public int XXX(int[] nums, int target) {
        int l=0,r=nums.length-1,mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}

