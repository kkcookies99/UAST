 var singleNumber = function(nums) {
    return nums.reduce((i, j) => i ^ j, 0)
};

