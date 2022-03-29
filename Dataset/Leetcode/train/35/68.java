 class Solution {
    public int XXX(int[] nums, int target) {
        int l=0;
        int right=nums.length-1;
        while (l<=right){
            int mid=(l+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (target>nums[mid]){
                l=mid+1;
            }
            if (target<nums[mid]){
                right=mid-1;
            }
        }
        return l;
    }
}

