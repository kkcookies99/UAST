 class Solution {
    public int XXX(int[] nums) {
        int ans = nums[0], min = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
        }
        return ans;
    }
}

