 class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int i = nums.length - 2, symbol = nums.length - 1;
        while (i >= 0) {
            if (nums[i] >= symbol - i) {
                symbol = i;
            }
            i--;
        }
        if (symbol == 0) {
            return true;
        } else {
            return false;
        }
    }
}

