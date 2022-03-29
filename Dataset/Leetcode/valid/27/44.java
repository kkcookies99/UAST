 class Solution {
    public int XXX(int[] nums, int val) {
        int right = nums.length - 1; // 数组中最后一个不等于val的元素的下标
        for (int i = right; i >= 0; i--) {
            if (nums[i] == val) {
                nums[i] = nums[right--];
            }
        }
        return right + 1;
    }
}

