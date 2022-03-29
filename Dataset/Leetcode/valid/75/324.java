class Solution {
    public void XXX(int[] nums) {
        int red = 0, blue = nums.length - 1, cur = 0;
        while (cur <= blue) {
            if (nums[cur] == 0) {
                swap(nums, cur, red);
                red++;
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, cur, blue);
                blue--;
            } else {
                cur++;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}

