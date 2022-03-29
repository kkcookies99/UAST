 class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) {
                int flag = 0;
                for (int j = i; j >= 0; j--) {
                    if (nums[j] > i - j) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}

