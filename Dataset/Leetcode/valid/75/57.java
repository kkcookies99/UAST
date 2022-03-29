class Solution {
    public void XXX(int[] nums) {
        int l = 0, r = nums.length - 1;
        int nextRed = 0;
        while (l <= r) {
            if (nums[l] == 0) {
                nums[l] = nums[nextRed];
                nums[nextRed++] = 0;
                l++;
            } else if (nums[l] == 2) {
                nums[l] = nums[r];
                nums[r] = 2;
                r--;
            } else {
                l++;
            }
        }
    }
}

