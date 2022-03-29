 var singleNumber = function(nums) {
    return nums.reduce((sum, cur) => sum ^ cur, 0)
};

