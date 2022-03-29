var XXX = function(nums) {
    const len = nums.length
    //当前位置剩余步数
    let step = nums[0]
    for (let i=1; i<len; i++) {
        //每走一步剩余步数-1
        step = Math.max(step, nums[i-1])-1
        //剩余步数小于0就失败
        if (step < 0) { return false }
    }
    if (step >= 0) {
        return true
    }
    return false
};

