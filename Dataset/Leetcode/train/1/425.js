 var XXX = function(nums, target) {
    let hash = {};
    let rest, anotherIdx;
    for(let i=0; i<nums.length; i++) {
        rest = target - nums[i];
        anotherIdx = hash[rest];
        if(anotherIdx != undefined) {
            return [anotherIdx, i];
        }
        hash[nums[i]] = i;
    }
};

