 var XXX = function(nums, target) {
    let res = [];
    for(i = 0; i < nums.length; i++) {

       let other = target - nums[i], 
           otherIndex = nums.indexOf(other);
        
        if (otherIndex !== i && otherIndex > -1) {
            res = [i, otherIndex]
            break;
        } 
    }
    return res;
};


