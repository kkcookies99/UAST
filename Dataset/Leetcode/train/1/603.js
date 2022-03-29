 var XXX = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        for (let j = 0; j < nums.length- 1 - i; j++) {
            if (target - nums[i] == nums[j+1]) {
                 return [i,j+1]
            }
        }
    }

};

