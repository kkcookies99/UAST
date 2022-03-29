 var XXX = function(nums, target) {
    for(i=0;i<nums.length;i++){
        if(nums[i]+nums[i+1]==target){
            return [i,i+1]
        }
    }
};

