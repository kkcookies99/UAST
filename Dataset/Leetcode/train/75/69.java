class Solution {
    public void XXX(int[] nums) {
        int n = nums.length;
        if (n == 1) return;
        int left = 0;
        int right = n - 1;
        int index = 0;
        while (index <= right) {
            if (nums[index] == 0) {
                swap(nums, left, index);
                left++;
                index++;
            } else if (nums[index] == 1) {
                index++;
            } else if (nums[index] == 2) {
                swap(nums, right, index);
                right--;
            }
        }
    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

