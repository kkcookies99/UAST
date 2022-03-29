var XXX = function(nums) {
    for(let j = 0; j<nums.length-1; j++){
        nums[j+1] = nums[j+1] + Math.max(0, nums[j]);
    }
    return Math.max(...nums);
};

