 var XXX = function(nums, target) {
    const map = new Map()
    let ret = []
    for (let i = 0; i < nums.length; i++) {
        const val = nums[i]
        if (map.has(target - val)) {
            ret = ret.concat([map.get(target - val), i])
        }
        map.set(val, i)
    }

    return ret
};

