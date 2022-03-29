 var singleNumber = function(nums) {
    let sum = 0
    for(let i=0; i<nums.length; i++) {
        sum ^= nums[i]
    }
    return sum
};

