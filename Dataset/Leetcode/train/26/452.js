 var XXX = function(nums) {
    let n = nums.length;
    let fast = 1, slow = 1;
    while (fast < n) {
        if (nums[fast] !== nums[fast - 1]) {
            nums[slow] = nums[fast];
            ++slow;
        }
        ++fast;
    }
    nums.splice(slow - 1, fast - slow)
};

