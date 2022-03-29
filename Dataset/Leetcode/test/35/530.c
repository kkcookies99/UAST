 var XXX = function(nums, target) {
    for (var i in nums)
        if (nums[i] >= target) return i
    return nums.length
};

