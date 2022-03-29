 var XXX = function(nums, target) {
    //// 1. 暴力穷举
    // for (let i=0; i<nums.length; i++) {
    //     let temp = target - nums[i];
    //     for (let j=i+1; j<nums.length; j++) {
    //         if (temp === nums[j]) {
    //             return [i, j];
    //         }
    //     }
    // }

    //// 2、 两遍哈希表
    // let map = new Map();
    // for (let i=0; i<nums.length; i++) {
    //     map.set(nums[i], i);
    // }
    // for (let i=0; i<nums.length; i++) {
    //     let temp = target - nums[i];
    //     if (map.has(temp) && map.get(temp)!=i) {
    //         return [i, map.get(temp)]
    //     }
    // }

    //// 3. 一遍哈希表
    let map = new Map();
    for (let i=0; i<nums.length; i++) {
        let temp = target - nums[i];
        if (map.has(temp) && map.get(temp)!=i) {
            return [map.get(temp), i];
        }
        map.set(nums[i], i);
    }
};

