 var singleNumber = function(nums) {
    for(let i=0; i<nums.length; i++){
        if(nums.indexOf(nums[i]) == nums.lastIndexOf(nums[i])){
            return nums[i];
        }
    }
    return null;
};

