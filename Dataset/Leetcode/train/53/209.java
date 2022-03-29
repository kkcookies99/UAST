class Solution {
    public int XXX(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int a : nums) {
            sum += a;
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;            
        }
        return max;
}

