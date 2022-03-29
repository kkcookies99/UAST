 var XXX = function(nums) {
    var len = nums.length;
    for (let i = 1; i < len; i++) {
        if (nums[i - 1] > 0) {
            nums[i] = nums[i - 1] + nums[i]
        }
    }
    return Math.max(...nums)
}```

