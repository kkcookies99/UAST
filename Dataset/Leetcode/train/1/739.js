 var XXX = function(nums, target) {
    for(var i = 0; i < nums.length; i++){
        var index = nums.indexOf(target-nums[i],i+1)
        if(index!=-1){
            return [i,index]
        }
    }
};

