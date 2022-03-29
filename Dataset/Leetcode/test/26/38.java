 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i += 1;
    }
}

