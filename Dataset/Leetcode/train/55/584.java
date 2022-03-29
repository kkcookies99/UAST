 class Solution {
    public boolean XXX(int[] nums) {
        for (int i = 0; i < nums.length - 1; ) {
            if (i == nums.length - 1)
                return true;
            if (nums[i] > 0) {
                i += nums[i];
                continue;
            } else if (nums[i] == 0) {
                boolean flag = true;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] >= i - j + 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }   
}

