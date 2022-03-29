 var XXX = function(nums, target) {
    const hash = {}
    let result = []
    
    nums.forEach(function(val, index){
        if (hash[target - val] === undefined) {
            hash[val] = index;
        } else {
            result = [hash[target - val], index];
        }
        
    });
    
    return result
};

