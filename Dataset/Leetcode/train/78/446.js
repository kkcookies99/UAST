 var XXX = function(nums) {
    let res = [[]]
    for (let i = 0; i < nums.length; i++) {
        let mergeItem = []
        for(let j = 0; j < res.length; j++) {
            let item = [...res[j], nums[i]]
            if (res.indexOf(item) === -1) {
                mergeItem.push(item)
            }
        }
        res = res.concat(mergeItem)
    }
    return res
};

