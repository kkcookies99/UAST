 var XXX = function(nums, target) {
    var r = {}, len = nums.length;
    r[nums[0]] = 0
    for(let i = 1; i < len; i++){
        if(r[target - nums[i]] !== undefined){
            return [r[target - nums[i]], i]
        }
        r[nums[i]] = i
    }
};

