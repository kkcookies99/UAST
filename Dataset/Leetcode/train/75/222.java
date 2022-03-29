class Solution {
    public void XXX(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    public static void quickSort(int[] nums, int left, int right) {
        if(left > right)
            return;
        int l = left;
        int r = right;
        int key = nums[l];
        while (l < r) {
            while (l < r && nums[r] >= key)
                r--;
            nums[l] = nums[r];
            while (l < r && nums[l] <= key)
                l++;
            nums[r] = nums[l];
        }
        nums[l] = key;
        quickSort(nums, left, l - 1);
        quickSort(nums, r + 1, right);
    }
}

