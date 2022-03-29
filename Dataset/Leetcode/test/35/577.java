 class Solution {
    public int XXX(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
                if (start > end){
                    return end + 1;
                }
            }else if(nums[mid] < target){
                start = mid + 1;
                if (start > end){
                    return start;
                }
            }
        }
        return -1;
    }
}

