 class Solution {
    public int XXX(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low+(high - low)/2;
            if(target < nums[mid]){
                high = mid -1;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return low;

// 边界值往下取，所以返回low
// 数组下标最大值，需要取 nums.length-1
    }
}

