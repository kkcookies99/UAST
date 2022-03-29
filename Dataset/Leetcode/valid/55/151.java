class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) return true;
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover, i + nums[i]);
            if (cover >= nums.length - 1) return true;
        }
        return false;
    }
}

