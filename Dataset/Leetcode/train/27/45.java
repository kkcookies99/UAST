 class Solution {
    public int XXX(int[] nums, int val) {
        int j = nums.length - 1; // 尾指针
        for (int i = 0; i <= j; i++) {
            if (val == nums[i]) {
                nums[i--] = nums[j--];
            }
        }
        return j+1;
    }
}

