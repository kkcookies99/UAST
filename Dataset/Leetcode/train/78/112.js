var XXX = function(nums) {
    var res=[[]];
    for(var i=0;i<nums.length;i++){
        var len=res.length;
        for(var ii=0;ii<len;ii++){
            res.push([...res[ii],nums[i]]);
        }
    }
    return res;
};

