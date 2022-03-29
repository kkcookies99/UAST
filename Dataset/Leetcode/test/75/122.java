class Solution {
    public void XXX(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i <= right;) {
            if (nums[i] == 0) {
                swap(nums, i, left++);
                i ++;
            } else if (nums[i] == 2) {
                swap(nums, i, right--);
            } else {
                i ++;
            }
        }
    }
    public void swap(int[] arr, int x, int y) {
        if (x != y) {
            arr[x] ^= arr[y];
            arr[y] ^= arr[x];
            arr[x] ^= arr[y];
        }
    }
}

