 var XXX = function(nums, target) {
    var len = nums.length;
    var map = new Map();
    for (var i=0; i<len; i++){
        var diff = target - nums[i];
        if (map.has(diff)){
            return [map.get(diff),i]
        }
        map.set(nums[i],i);
    }
};

