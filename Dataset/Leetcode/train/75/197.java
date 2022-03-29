class Solution {
    public void XXX(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int color = 0, j = 0; color < 2; ++color) {
            for (int i = j; i < nums.length; ++i) {
                if (nums[i] == color) {
                    swap(nums, i, j++);
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

