 class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int x = 1, y = 1;
        while(x < n) {
            if(nums[x] != nums[x-1]) {
                nums[y] = nums[x];
                y++;
            }
            x++;
        }
        return y;
    }
}

