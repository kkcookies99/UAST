 var XXX = function(nums, target) {
    var keys = []
    for(var i=0; i<nums.length; i++){
        for (var j = 0; j < keys.length; j++) {
            if (keys[j] === nums[i]){
                if (j !== i) {
                    return [j, i]
                }
                
            }
        }
        keys[i] = target - nums[i]
    }
};

