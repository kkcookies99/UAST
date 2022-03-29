 class Solution {
    public int XXX(int[] nums, int target) {
        int left =0, right=nums.length-1;
        while(left <= right) {
            int min = (left + right) / 2;
            if(target == nums[min]) {
                return min;
            } else if(target > nums[min]) {
                left += 1;
            } else {
                right -= 1;
            }
        }
        return left;
    }
}

