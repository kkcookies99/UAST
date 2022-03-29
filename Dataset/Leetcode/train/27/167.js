 var XXX = function(nums, val) {
    let start = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== val) {
            nums[start] = nums[i];
            start += 1;
        }
    }
    return start;
};

