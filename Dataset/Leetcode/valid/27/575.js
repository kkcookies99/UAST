 var XXX = function(nums, val) {
    let length = nums.length;
    for (let i = 0; i < length; i++) {
        if (nums[i] == val) {
            for (let j = i; j < length - 1; ) {
                nums[j] = nums[++j];
            }
            i--;
            length--;
        }
    }
    return length;
};

