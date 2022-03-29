 class Solution {
    public int XXX(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            // 转移方程
            pre = nums[i] >= pre + nums[i] ?  nums[i] : nums[i]+pre;
            // 当前累计值与历史累计值比大小，取大值
            sum = Math.max(sum,pre);
        }
        return sum;
    }
}

