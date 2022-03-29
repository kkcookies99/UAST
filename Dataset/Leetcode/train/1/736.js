 var XXX = function(nums, target) {
    for(let i=0;i<nums.length;i++){
        if(nums.indexOf(target-nums[i])!=-1&&nums.indexOf(target-nums[i])!=i){
            return [nums.indexOf(target-nums[i]),i]
        }
    }
};

