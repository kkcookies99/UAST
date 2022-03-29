 var singleNumber = function(nums) {
    if(nums.length > 1){
        for(let i = 1; i < nums.length; i++){
            nums[0] = nums[0] ^ nums[i]
        }
    }
    return nums[0];
};

