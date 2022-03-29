 var XXX = function(nums) {
    let sum = 0;
    let max = -Infinity;
    nums.forEach(num => {
        sum += num;
        if (sum <= num) {
            sum = num
        }
        max = Math.max(sum, max)
    })
    return max;
};

