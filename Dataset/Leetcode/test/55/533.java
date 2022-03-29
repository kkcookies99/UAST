 class Solution {
    public boolean XXX(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length && i <= farthest; i++) {
            farthest = Math.max(farthest, i + nums[i]);
        }

        return farthest >= nums.length - 1;
    }
}

