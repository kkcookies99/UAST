 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int x = 1;
        int tmp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                //记录当前位置
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }
}

