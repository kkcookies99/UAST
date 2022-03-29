 class Solution {
    public int XXX(int[] nums) {
        int length = nums.length;
        if (length == 1) return nums[0];
        int result = Integer.MIN_VALUE;
        int[] dpArr = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            if (dpArr[i - 1] >= 0) {
                dpArr[i] = dpArr[i - 1] + nums[i - 1];
            } else {
                dpArr[i] = nums[i - 1];
            }
        }
        for (int index = 1; index < dpArr.length; index++) {
            result = Math.max(result, dpArr[index]);
        }
        return result;
    }
}

