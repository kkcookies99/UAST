 class Solution {
    public void XXX(int[] nums) {
        int less = -1;
        int more = nums.length;
        int left = 0;
        while (left < more) {
            if (nums[left] == 0) {
                swap(nums, ++less, left++);
            } else if (nums[left] == 2) {
                swap(nums, --more, left);
            } else {
                left++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

