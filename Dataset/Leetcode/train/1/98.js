 var XXX = function(nums, target) {
    let res = {}
    
    for(let i = 0; i < nums.length; i++) {
        if(res[nums[i]] !== undefined) 
            return [res[nums[i]], i]
        else
            res[target - nums[i]] = i
    }
}

