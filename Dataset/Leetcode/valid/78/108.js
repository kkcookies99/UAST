var XXX = function(nums) {
    const tmp = [[]]
    for(let i=0; i<nums.length; i++){
        tmp.forEach(item => {
            tmp.push([...item, nums[i]])
        })
    }
    return tmp
};
