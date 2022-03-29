 class Solution {
    public int XXX(int[] nums) {
        int left = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return left + 1;
    }
}

