class Solution {
    public boolean XXX(int[] nums) {
        for (int i = 0, j = 0;; i++){
            if (i + nums[i] >= nums.length - 1) return true;
            j = Math.max(i + nums[i], j);
            if (i == j && nums[i] == 0) return false;
        }
    }
}

