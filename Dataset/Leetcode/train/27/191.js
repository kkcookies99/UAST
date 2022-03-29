 var XXX = function(nums, val) {
    for (var i = 0; i < nums.length-1; i++) {
        if(nums[i]==val && nums[i+1] != val){
            nums[i]=[nums[i+1],nums[i+1]=nums[i]][0];
        }
    }
    return nums
};

