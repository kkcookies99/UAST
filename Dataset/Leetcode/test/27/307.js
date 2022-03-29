 var XXX = function(nums, val) {
    var k = [];
    for(var i = 0;i<nums.length;i++) {
        if (nums[i] === val) {
            k.push(i);
        }
    }
    return k.length;
};

