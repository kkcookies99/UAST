class Solution {
    public boolean XXX(int[] nums) {
        // 本题的关键就是求可到达的最远距离 是否大于等于 最后的元素的下标
        // 创建一个 max标识符
        // 递推公式就是 max = Math.max(max, i + nums[i]);
        // 循环就是 在能够到达的最远距离内进行循环，看能不能到达目的地
        if(nums == null || nums.length < 2) return true;
        int max = 0;
        for(int i = 0; i <= max; i ++){
            max = Math.max(max, i + nums[i]);
            if(max >= nums.length - 1) return true;
        }
        return false;
    }
}

