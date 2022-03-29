var XXX = function(nums) {
    let a = 0, b = 0, c = 0
    for(let i = 0; i < nums.length; i++) {
        if(nums[i] == 0) {
            a++
        }
        if(nums[i] == 1) {
            b++
        }
        if(nums[i] == 2) {
            c++
        }
    }
    for(let i = 0; i < nums.length; i++) {
        if(i >= 0 && i < a) {
            nums[i] = 0
        } else if(i < a+b) {
            nums[i] = 1
        } else if(i < a+b+c) {
            nums[i] = 2
        }
    }
    return nums
};

