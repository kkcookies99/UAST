var XXX = function(nums) {
    let pos = 0;

    for (let i = 0; i < nums.length && i <= pos; ++i) {
        pos = Math.max(pos, i + nums[i]);
    }

    return pos >= nums.length - 1;
};

