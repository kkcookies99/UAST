class Solution {
    public boolean XXX(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                int j = i;
                i--;
                for (; i >= 0; i--) {
                    if (i + nums[i] > j) {
                        break;
                    }
                }
                if (i < 0) {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}

