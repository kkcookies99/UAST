 class Solution {
  public int XXX(int[] nums) {
        if (nums.length == 0) return 0;
        int len = 1;
        for (int i = 1, j = 0; i < nums.length; ) {
            if (nums[j] == nums[i]) {
                i++;
            } else {
                j++;
                len++;
                nums[j] = nums[i];
                i++;
            }
        }
        return len;
    }
}
