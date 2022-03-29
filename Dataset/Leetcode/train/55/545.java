 class Solution {
    public boolean XXX(int[] nums) {
        int n = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            n = nums[i] >= n ? 1 : n + 1;
            if (i == 0 && n != 1) return false;
        }
        return true;
    }
}

