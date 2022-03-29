class Solution {
    public void XXX(int[] nums) {
        int lt = 0;
        int gt = nums.length - 1;
        int i = 0;
        while (i <= gt) {
            if (nums[i] > 1) {
                swap(nums, gt--, i);
            } else if (nums[i] < 1) {
                swap(nums, lt++, i++);
            } else {
                ++i;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

