class Solution {
    public boolean XXX(int[] nums) {
        int length = nums.length;
        boolean[] res = new boolean[length];
        res[0] = true;
        for (int i = 0; i < length; i++) {
            if (res[i]) {
                for (int j = 1; j <= nums[i] && i + j < length; j++) {
                    res[i + j] = true;
                }
            }
            if (res[length - 1]) {
                return true;
            }
        }
        return res[length - 1];
    }
}

