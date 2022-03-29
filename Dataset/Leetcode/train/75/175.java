class Solution {
    public void XXX(int[] nums) {
        // 快排三路切分
        int left = 0, right = nums.length  - 1, index = 0;
        while (index <= right) {
            if (nums[index] == 0) {
                swap(nums, index++, left++);
            } else if (nums[index] == 2) {
                swap(nums, index, right--);
            } else {
                index++;
            }
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

