 class Solution {
    public int XXX(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int middle;
        while (min <= max) {
            middle = (max - min) / 2 + min;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
        }
        return max + 1;
    }
}

