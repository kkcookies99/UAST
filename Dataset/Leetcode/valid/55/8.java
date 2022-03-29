class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        //覆盖范围
        int coverRange = nums[0];
        //在覆盖范围内更新最大的覆盖范围
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

