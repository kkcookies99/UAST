 class Solution {
    public boolean XXX(int[] nums) {
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (next < i) return false;
            next = Math.max(next, i + nums[i]);
        }
        return true;
    }
}

