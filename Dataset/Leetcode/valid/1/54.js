 var XXX = function(nums, target) {
    var d = {}
    for (let i=0; i<nums.length; i++) {
        var index = nums.indexOf(target-nums[i])
        if (index !== -1 && index !== i) {
            return [i,index]
        }
    }
};

