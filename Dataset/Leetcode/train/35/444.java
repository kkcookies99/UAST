 class Solution {
    public int XXX(int[] nums, int target) {
  int l = -1, r = nums.length;
        while (l + 1 != r) {
            int mid=l+(r-l)/2;
            if(nums[mid]<target){
                l=mid;
            }
           else r=mid;
        }
        return r;
    }
}

