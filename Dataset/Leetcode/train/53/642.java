 class Solution {
    public int XXX(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return nums[0];
        }

        int max = Integer.MAX_VALUE;
        for(int i=0;i<length;i++) {
            if(max == Integer.MAX_VALUE) {
                max = f(nums, i);
            } else {
                max = Math.max(f(nums, i), max);
            }
        }
        return max;
    }

    private int f(int[] nums, int i) {
        if(i == 0) {
            return nums[0];
        }
        return nums[i] + Math.max(f(nums, i-1), 0);
    }
}

