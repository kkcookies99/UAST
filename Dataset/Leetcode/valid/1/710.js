 var XXX = function(nums, target) {
    var result = [];
    for(var i = 0;i<nums.length;i++){
        var remainder = target - nums[i];
        var index  = nums.indexOf(remainder);
        if(index >= 0 && i !== index){
            result = [i,index];
            break;
        };
    };
    return result;
};

