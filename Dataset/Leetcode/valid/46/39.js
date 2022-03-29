var XXX = function(nums) {
    if(nums.length == 1) return [nums]
    let res = []
    for(let i=0; i<nums.length; i++) {
        res = res.concat(XXX([...nums.slice(0,i), ...nums.slice(i+1)]).map(v => [nums[i], ...v]))
    }
    return res
};

