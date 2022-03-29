class Solution {
    public int XXX(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i : nums) {
            sum = sum > 0 ? sum + i : i;
            max = Math.max(sum, max);
        }
        return max;
    }
}

