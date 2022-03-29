 class Solution {
    public int XXX(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                j++;
                nums[i] = 101;
            }
        }
        Arrays.sort(nums);
        return nums.length - j;
    }
}

