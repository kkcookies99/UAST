 class Solution {
    public int XXX(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int end = 1;

        for (int i = 1; i < n; i++) {
            if (nums[end - 1] != nums[i]) {
                nums[end] = nums[i];
                end++;
            }
        }
        return end;
    }
}

