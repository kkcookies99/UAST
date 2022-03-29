 var XXX = function(nums) {
    let slow = 0
    let fast = 1
    while(fast < nums.length){
        if(nums[fast] !== nums[slow]){
            slow ++
            nums[slow] = nums[fast]
        }
        fast ++
    }
    return slow + 1
};

