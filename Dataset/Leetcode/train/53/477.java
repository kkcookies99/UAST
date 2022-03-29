 class Solution {
    public int XXX(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            count += nums[i];
            max = Math.max(max, count);
            count = count < 0 ? 0 : count;
        }
        return max;
    }
}

