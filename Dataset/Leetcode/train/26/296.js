 var XXX = function(nums) {
    let tag = ''
    for(let i = nums.length - 1; i >= 0 ; i--) {
        if(nums[i] !== tag) {
            tag = nums[i]
        } else {
            nums.splice(i, 1)
        }
    }
};

