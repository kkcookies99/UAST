 var XXX = function(nums, target) {
    const idx = nums.indexOf(target);
    if (idx >= 0) {
        return idx;
    }
    let i=0;
    while (nums[i] < target && i < nums.length) {
        i++;
    }
    return i;
};

