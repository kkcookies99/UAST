var XXX = function(nums) {
    let max = 0;
    for(let i = 0; i < nums.length; i++) {
        if(max >= i) {
            max = Math.max(max, nums[i] + i);
        }
        else {
            return false;
        }
    }
    return true;
};

