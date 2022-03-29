 var XXX = function(nums, target) {
    for(let i = 0; i < nums.length; i++) {
        for(let j = i + 1; j < nums.length; j++) {
            if(nums[j] + nums[i] === target) {
                return [i, j]
            }
        }
    }  
}

