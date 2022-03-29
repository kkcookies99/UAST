class Solution {
    public void XXX(int[] nums) {
        int redSize = 0;
        int whiteSize = 0;
        int blueSize = 0;
        for (int num : nums) {
            if (num == 0) redSize++;
            if (num == 1) whiteSize++;
            if (num == 2) blueSize++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < redSize) nums[i] = 0;
            else if (i < redSize + whiteSize) nums[i] = 1;
            else if (i < redSize + whiteSize + blueSize) nums[i] = 2;
        }
    }
}

