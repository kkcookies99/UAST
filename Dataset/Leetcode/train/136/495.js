 var singleNumber = function(nums) {
    return nums.sort((a,b)=>a-b).join(',').replace(/(-?\d+),(\1)|\,/g,'')
};

