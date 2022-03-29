 class Solution {
    public int XXX(int[] nums) {
        int pre = 0;
        int MAX = nums[0];

        for (int x : nums) {
            pre = Math.max (x, pre + x);
            MAX = Math.max (MAX, pre);
        }
        return MAX;

    }
}

