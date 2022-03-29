 var XXX = function(nums) {
    let max_sum = cur_sum = nums[0];
    for (let n = 1; n<nums.length; n++) {
        cur_sum = (cur_sum+nums[n]) > nums[n] ? (cur_sum+nums[n]) : nums[n];
        max_sum = cur_sum>max_sum ? cur_sum : max_sum;
    }
    return max_sum;
};

