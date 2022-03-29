  var XXX = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        let index = nums.indexOf(target - nums[i])
        if (index > -1 && index !== i) {
            return [i, index]
        }
    }
};

