 var singleNumber = function(nums) {
    var result = 0;
    for(var i = 0; i < nums.length; i ++){
        result ^= nums[i];
    }
    return result;
};

