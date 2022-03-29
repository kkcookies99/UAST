 var XXX = function(nums, target) {
    let res = [];
    let map = {};
    for(let i = 0; i < nums.length; i++) {
        map[nums[i]] = i;
    }
    for(let j = 0; j < nums.length; j++) {
        const remain = target - nums[j];
        if(typeof map[remain] !== 'undefined' && map[remain] !== j) {
            res.push(map[remain])
            res.push(j)
           break;
        }
    }
    return res;
};

