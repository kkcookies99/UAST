 class Solution {
    public boolean XXX(int[] nums) {
        int start = 0;
        int end = 1;
        int maxPos = 0;
        while (start < end) {
            for (int i = start; i < end; i++) {
                maxPos = Math.max(maxPos, i + nums[i]);
                if (maxPos >= nums.length - 1) {
                    return true;
                }
            }

            start = end;
            end = maxPos + nums[maxPos];
        }

        return false;
    }
}

