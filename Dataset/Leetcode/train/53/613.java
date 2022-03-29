 class Solution {
    public int XXX(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;

        for (int x : nums) {
            sum += x;
            res = res < sum ? sum : res;
            if (sum < 0) {
                sum = 0;
            }
        }

        return res;
    }
}

