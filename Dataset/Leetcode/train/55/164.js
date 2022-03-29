var XXX = function(nums) {
    if (nums.length <= 1)
        return true
    else if (nums[0] == 0) {
        return false 
    }
    // 贪婪算法 获取每一点能达到的最大位置
    var Dp = [nums[0]];
    for (var i = 1; i < nums.length; i++) {
        Dp[i] = Math.max(nums[i], Dp[i-1]-1);
        if (Dp[i]+i >= nums.length-1) {
            return true
        } else if (Dp[i] == 0 && i < nums.length-1) {
            return false
        }
    }
    return true
};

