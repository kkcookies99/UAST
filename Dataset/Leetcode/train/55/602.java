 class Solution {
    public boolean XXX(int[] nums) {
        int zeroIndex = -1;
        int rightLastIndex = nums.length - 1;

        for (int i = rightLastIndex - 1; i >= 0; i--) {
            if (zeroIndex != -1 && zeroIndex - i < nums[i]) {
                zeroIndex = -1;
            }

            if (nums[i] == 0 && zeroIndex == -1) {
                zeroIndex = i;
            }
        }

        return zeroIndex == -1;
    }
}

