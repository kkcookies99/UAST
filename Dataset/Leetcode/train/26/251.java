 class Solution {
    public int XXX(int[] nums) {
                if (nums.length == 1) {
            return 1;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return ++i;
    }
}

