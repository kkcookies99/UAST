 class Solution {
    public void XXX(int[] nums) {
        int i = -1;
        int k = nums.length;
        while (i < nums.length-1 && nums[i+1] == 0) ++i;
        while (k > i+1 && nums[k-1] == 2) --k;
        if (i == k-1) return;
        int j = i+1;
        while (j < k) {
            if (nums[j] == 0) {
                nums[j] = nums[i+1];
                nums[++i] = 0;
                ++j;
            } else if (nums[j] == 2) {
                nums[j] = nums[k-1];
                nums[--k] = 2;
            } else {
                ++j;
            }
        }
    }
}

