 class Solution {
    public int XXX(int[] nums, int val) {
        int tail = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == val && i <= tail) {
                swap(nums, i, tail--);
            }
        }
        return tail + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

