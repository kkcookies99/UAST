 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        int count = 0;
        for (int i = len - 1; i >= 0; -- i) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            }
            digits[i] = 0;
            ++ count;
        }
        if (count == len) {
            int[] nums = new int[len + 1];
            System.arraycopy(digits, 0, nums, 1, len);
            nums[0] = 1;
            digits = nums;
        }
        return digits;
    }
}

