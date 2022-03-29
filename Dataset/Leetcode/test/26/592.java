 class Solution {
    public int XXX(int[] nums) {
         if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        int temp = nums[0];
        nums[j++] = temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[j++] = nums[i];
                temp = nums[i];
            }
        }
        return j;
    }

