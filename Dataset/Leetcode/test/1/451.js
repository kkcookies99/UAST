 var XXX = function(nums, target) {
    let a = [];
    for(let i in nums) {
        let v = target - nums[i]
        let _i = nums.indexOf(v);
        if(_i > -1 && _i != i) {
            a = [i,_i];
            break;
        }
    }
    return a;
};

