 var singleNumber = function(nums) {
    if (nums.length == 1) return nums[0]
    nums.sort()
    for (let i = 0; i < nums.length; i += 2) {
        if (nums[i] != nums[i + 1]) {
            if (nums[i - 1] != undefined) {
                if (nums[i - 1] != nums[i]) {
                    return nums[i]
                }
            } else {
                return nums[i]
            }
            if (nums[i + 2] != undefined) {
                if (nums[i + 1] != nums[i + 2]) {
                    return nums[i + 1]
                }
            } else {
                return nums[i + 1]
            }
        }
    }
    return null
};

