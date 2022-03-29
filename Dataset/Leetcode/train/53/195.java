class Solution {
    public int XXX(int[] nums) {
        int all_sum = 0;
        int min_sum = 0;
        int res = Integer.MIN_VALUE;
        for (int num : nums) {
            all_sum += num;
            res = Math.max(res, all_sum - min_sum);
            min_sum = Math.min(min_sum, all_sum);
        }
        return res;   
    }
}

