 class Solution {
    public int XXX(int[] nums, int target) {
        int left = 0, mid = 0;
        int right = nums.length;
        
        if(right == 0||target < nums[0]){
            return 0;
        }
        if(target > nums[right-1]){
            return right;
        }
        while(left <= right){
            mid = (left+right)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                right = mid - 1;
            }
            if(target > nums[mid]){
                left = mid + 1;
            }
        }
        return left;
    }
}

