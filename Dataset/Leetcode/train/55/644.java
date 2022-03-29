 class Solution {
    public boolean XXX(int[] nums) {
        //当成区间问题，nums[i]就可以当成区间长度
        //这个题的意思就看从0开始的连续区间能不能达到nums.length-1这个坐标位置
        int len = nums.length;
        if (len == 0 || len == 1 || nums == null) return true;
        
        int start = 0, end = nums[0];
        for (int i = 1; i < len; i++) {
            if (end >= i) {
                end = Math.max(end, i + nums[i]);
            } else {
                return false;
            }
        }

        return true;
    }
}

