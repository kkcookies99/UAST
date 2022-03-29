 var XXX = function(nums, target) {
    let map = {};
    for(let i=0;i<nums.length;i++){
        map[nums[i]] = i+'';
    }
    
    for(let i=0;i<nums.length;i++){
        var c = map[target-nums[i]];
        if(c&&(c!==i+''))return [i,c]
    }
};

