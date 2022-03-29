 var XXX = function(nums) {
    if (nums.length == 1) return 1
    for (let i = 0; i < nums.length; i++) {
        let n = 0, j = i + 1, val = nums[i]
        while (j < nums.length && nums[j] == val) {
            j++
            n++
        }
        if (n == 0) continue
        nums.splice(i + 1, n)
        i = i - n
        if (i < -1) i = -1
    }
    return nums.length
};

