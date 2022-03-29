 var XXX = function(nums, val) {
    for(let i = nums.length; i >= 0; i--) {
        if(nums[i] === val){
            nums.splice(i, 1)
        }
    }
    return nums.length
};

