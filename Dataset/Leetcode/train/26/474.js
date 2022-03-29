 var XXX = function(nums) {
    const hash = {};
    
    let uniqueArray = nums.filter(val => !hash[val] && (hash[val] = true));     
    nums.length = 0;
    uniqueArray.forEach(val => nums.push(val));

    return nums.length;
};

