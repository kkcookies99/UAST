  class Solution {
    public int XXX(int[] nums, int val) {
        int count = 0;
        int length = nums.length;
        for (int i = 0;i < length;i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i]; 
            }
        }
        return count;
    }
}

