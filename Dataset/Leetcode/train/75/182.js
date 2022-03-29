var XXX = function(nums) {
    let len = nums.length

    if(len <= 1) {
        return nums
    }
    for (let i = 0; i < len; i++) {
        let preIndex = i - 1, cur = nums[i];
        while (preIndex >= 0 && nums[preIndex] > cur) {
            nums[preIndex + 1] = nums[preIndex]
            preIndex--;
        }
        nums[preIndex + 1] = cur
    }
    return nums
};

