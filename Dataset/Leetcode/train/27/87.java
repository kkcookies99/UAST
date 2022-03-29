 class Solution {
    public int XXX(int[] nums, int val) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int x = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }
}