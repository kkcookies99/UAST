class Solution {
    public void XXX(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            //将2往后放
            while (i <= right && nums[i] == 2) {
                swap(nums, i, right);
                right--;
            }

            //将0往前放
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

