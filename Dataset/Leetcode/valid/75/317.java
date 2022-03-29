class Solution {
    public void XXX(int[] nums) {
        int l = 0, r = nums.length - 1;
        for (int i = l; i <= r; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[l++] = 0;
            } else if (nums[i] == 2) {
                while (r > i && nums[r] == 2) {
                    r--;
                }
                nums[i] = 1;
                if (nums[r] == 0) {
                    nums[l++] = 0;
                }
                nums[r--] = 2;
            }
        }
    }
}

