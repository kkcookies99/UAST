 class Solution {
    public int[] XXX(int[] digits) {
        int tmp = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            digits[i] += tmp;
            tmp = digits[i] / 10;
            digits[i] = digits[i] % 10;
            if (tmp == 0) {
                return digits;
            }
        }
        int[] nums = new int[digits.length + 1];
        System.arraycopy(nums, 0, nums, 1, digits.length);
        nums[0] = 1;
        return nums;
    }
}

