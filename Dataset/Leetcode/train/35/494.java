 class Solution {
    public int XXX(int[] nums, int target) {
        int low, mid, high;
        low = 0;
        high = nums.length - 1;
        mid = (low + high) / 2;
        while(low <= high){
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                low = mid + 1;
                mid = (low + high) / 2;
            }else{
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        return high+1;
    }
}

