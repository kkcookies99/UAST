 var XXX = function(nums) {
    let left = 0
    let right = 0
    while(right < nums.length) {
        if(nums[left] == nums[right]) {
            right++
        } else {
            nums[left + 1] = nums[right]
            left++
            right++
        }
    }
    return left+1
};

