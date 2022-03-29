var XXX = function(nums) {
    if(nums.length == 1) return true;
    let maxd = 0;
    for(let i = 0; i < nums.length; i++){
        maxd = Math.max(maxd,nums[i] + i);
        if(maxd <= i && i < nums.length - 1) return false;
    }
    return true;
};

