 var XXX = function(nums) {
    let retArr = [];
    let compareObj = {};
    for (let i = 0; i < nums.length - 2; i++) {
        for (let j = i + 1; j < nums.length - 1; j++) {
            for (let z = j + 1; z < nums.length; z++) {
                if (nums[i] + nums[j] + nums[z] === 0) {
                    const arrItem = [nums[i], nums[j], nums[z]].sort((a, b) => a - b);
                    if (!compareObj[arrItem.toString()]) {
                        retArr.push(arrItem);
                        compareObj[arrItem.toString()] = true;
                    }
                }
            }
        }
    }
    return retArr;
};

