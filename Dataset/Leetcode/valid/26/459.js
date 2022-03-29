 var XXX = function(nums) {
    const list = Array.from(new Set(nums))
    nums.splice(list.length, nums.length - list.length)
    list.forEach((el, i) => {
        nums[i] = el
    })
    return nums.length
};

