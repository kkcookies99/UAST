class Solution {
    public void XXX(int[] nums) {
        int lt = 0;
        int gt = nums.length - 1;
        for (int i = lt; i <= gt; i++) {
            if (nums[i] == 0) {
                exchange(nums, i, lt++);
            } else if (nums[i] == 2) {
                exchange(nums, i--, gt--);
            }
        }
    }

    private void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}```

