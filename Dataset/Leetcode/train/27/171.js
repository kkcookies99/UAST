 var XXX = function(nums, val) {
    let b = nums.length;
    for (let i = 0; i < b; i++) {
            let a = nums.shift();
            if(a != val) {
                nums.push(a);
            }
    }
    return nums.length;
};