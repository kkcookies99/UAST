class Solution {
    public boolean XXX(int[] nums) {
        int start = 0;
        int end = 0;
        while (start <= end && end < nums.length - 1) {
            end = Math.max(end, nums[start] + start);
            start++;
        }
        return end >= nums.length-1;
    }
}

