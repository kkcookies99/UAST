 var XXX = function(nums) {
    let result = [[],[nums[0]]]
    for(let i=1;i<nums.length;i++) {
        let newResult = result.map((item) => [...item,nums[i]])
        result = result.concat(newResult)
    }
    return result
};

