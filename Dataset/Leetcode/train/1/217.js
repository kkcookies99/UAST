 var XXX = function(nums, target) {
    for(var i =0;i < nums.length;i++){
        for(var j =0;j<nums.length;j++){
            if(nums[i] + nums[j] == target && i!=j){
                return [i,j]
            }
        }
    }
};

