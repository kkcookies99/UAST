 class Solution {
    public int XXX(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int ans = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            //如果元素比target小,且target不存在,那target应该插在元素后一位
            if(nums[mid] < target){
                left = mid+1;
                ans = left;
            }
            //如果元素比target大,且target不存在,那tarrget应该插在这个元素的位置,后面的元素整体向后移一位
            if(nums[mid] > target){
                right = mid -1;
                ans = right+1;
            }
        }
        return ans;
    }
}

