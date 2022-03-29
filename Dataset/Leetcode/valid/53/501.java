 class Solution {
    public int XXX(int[] nums) {
        int sum = nums[0]; // 以i结尾的子数组的连续和最大为 sum
        int max = nums[0];
        for (int i=1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}

