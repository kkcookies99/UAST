 var singleNumber = function(nums) {
    return nums.reduce((p, c) => p ^ c, 0);
};

