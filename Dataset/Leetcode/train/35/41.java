 class Solution {
    public int XXX(int[] nums, int target) {
             int l=0,r=nums.length-1;
        while (l<r-1){
            int mid=l+(r-l)/2;
            if (nums[mid]>target){
                r=mid;
            }else{
                l=mid;
            }
        }
        if (nums[l] == target){
            return l;
        }else if (nums[r] == target){
            return r;
        }else if (nums[r] < target) {
            return r+1;
        }else if (nums[l] > target) {
            if (l==0){
                return 0;
            }
            return l-1;
        }else {
            return l+1;
        }
    }
}

