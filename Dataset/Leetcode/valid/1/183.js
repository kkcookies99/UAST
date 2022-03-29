 var XXX = function(nums, target) {
    for(var i=0; i<nums.length; i++){
        var sureIndex = nums.lastIndexOf(target-nums[i]);
        if(sureIndex>i){
            return [i,sureIndex];
        }
    }
};

