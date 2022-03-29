 var XXX = function(nums, target) {
    var mp = {};
    for (let i=0; i<nums.length; i++) {
        if (mp[target-nums[i]] !== undefined) {
            return [mp[target-nums[i]], i];
        } else {
            mp[nums[i]] = i;
        }
    }
    return [];
};

