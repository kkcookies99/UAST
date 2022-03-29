 var XXX = function(nums, target) {
    const map = {};
    for(let i = 0, len = nums.length; i < len; i++) {
        const value = nums[i];
        const targetValue = target - value;
        const cacheIndex = map[targetValue]
        if (cacheIndex !== undefined) {
            return [cacheIndex, i];
        }
        map[value] = i;
    }
};

