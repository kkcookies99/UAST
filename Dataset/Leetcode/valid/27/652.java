 class Solution {
    public int XXX(int[] nums, int val) {

        int left = 0, right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                swap(nums, left, right-1);
                right--;
            } else {
                left++;
            }
        }

        return right;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
