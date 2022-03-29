 var XXX = function(nums) {
    nums.push('a');
    let n = 0;
    for (let i = 1; i < nums.length; i++) {
        if (nums[n] == nums[i]) continue;
        nums[++n] = nums[i];
    }
    // console.log(nums, n);
    return n;
};

